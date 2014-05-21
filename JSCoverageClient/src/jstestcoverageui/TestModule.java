package jstestcoverageui;

import com.google.common.base.Joiner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.generateByRandom;
import utils.IParamGenerator;
import utils.ResourceUtils;
/**
 *
 * @author pannawat.janthong
 */
public class TestModule {
    static int LOOP = 1;
    private String tcFile;    
    Process chrome;
    static String CHROMEBIN = System.getenv("CHROME_BIN");
    public String testPath = "";
    private String testedFile = "";
    private String module = "";
    private String objectName = "";
    private String iteration = "";
    private String funcName = "";
    private String testId = "";
    private ArrayList<String> JS_PATHS = new ArrayList<String>(Arrays.asList(
        "space,../../../../../../Content/Space/javascript/src",
        "rts,../../../src/rts",
        "shared,../../../src/shared"));
    private static String JSCOVERAGE_RUNNER = "D:\\Explorer\\Runtime\\Explorer.SharedResources\\javascript\\dojo\\src\\util\\doh";
            
    
    public TestModule(String testedFile, String instrumentFile, String module,String objectName, String funcName, String[] params, String testId){
        ArrayList<String> testScript = new ArrayList<String>();
        ArrayList<String> paramSeriesList = new ArrayList<String>();
        this.testedFile = testedFile;        
        this.objectName = objectName;
        this.testId = testId;
        
        String[] moduleName = objectName.split("\\.");
        if(moduleName.length > 1){
            objectName = moduleName[moduleName.length-1];
        } else {
            objectName = moduleName[0];
        }
        
        String modulePath = module.replaceAll("\\.", "/");
        this.module = modulePath;
        
        Path testedFilePath = Paths.get(testedFile);
        Path tcPath = testedFilePath.getParent();
        
        this.tcFile = tcPath.toString() + "\\tests\\" + testedFilePath.getFileName();
        
        // Generate parameter               
               
        for(int l=0; l< LOOP; l++){
            paramSeriesList.add(generateParam(params));
        }
        // Generate test cases
        List<String> testCaselines = new ArrayList<String>();
        
        try {            
            Path p = FileSystems.getDefault().getPath("src\\doh_template","DOHCaseTemplate.js");
            List<String> tcTemplate = Files.readAllLines(p.toAbsolutePath(), Charset.defaultCharset());            
            
            
            for(int l=0; l<LOOP; l++){
                int lineNum = tcTemplate.size();
                
                if(l>=1){
                    testCaselines.add(",");
                }
                
                Date now = new Date();        
                long t = now.getTime();
                
                for(int i = 0; i<lineNum; i++) {
                    String line = tcTemplate.get(i);      
                    if(l!=0 ){
                        line = line.replace("[SETUP]", "");
                    }
                    if(l != (LOOP-1)){
                        line = line.replace("[TEARDOWN]", "");
                    }
                    
                    line = line.replace("[TEST_NAME]", funcName + "_" + l);
                    this.iteration = "" + t + l;
                    line = line.replace("[ITERATION]", this.iteration);
                    if(objectName.equalsIgnoreCase("")){
                        line = line.replace("[MODULE_LOADER].", "");
                    } else {
                        line = line.replace("[MODULE_LOADER]", objectName);
                    }
                    this.funcName = funcName;
                    line = line.replace("[FUNCTION_NAME]", this.funcName);                
                    line = line.replace("[PARAMETERS]", paramSeriesList.get(l)); 
                    
                    testCaselines.add(line);
                }
                t = 0;
            }
        } catch(Exception e){
            e.getMessage();
        }
        
        
        // Generate test module
        List<String> testModulelines = new ArrayList<String>();
        try {
            Path p = FileSystems.getDefault().getPath("src\\doh_template","DOHTemplate.js");
            testModulelines = Files.readAllLines(p.toAbsolutePath(), Charset.defaultCharset());
            int lineNum = testModulelines.size();
            for(int i = 0; i<lineNum; i++) {
                String line = testModulelines.get(i);
                
                
                if(modulePath.equalsIgnoreCase("")){
                    line = line.replace(", \"[MODULE_PATH]\"", "");
                } else {
                    line = line.replace("[MODULE_PATH]", modulePath);
                }      
                
                if(objectName.equalsIgnoreCase("")){
                    line = line.replace("[MODULE_LOADER].", "");
                    line = line.replace("\"[MODULE_LOADER]\"", "test");
                    line = line.replace(", [MODULE_LOADER]", "");
                } else {
                    line = line.replace("[MODULE_LOADER]", objectName);
                }                              
                testModulelines.set(i, line);
            }        
            
        } catch(Exception e){
            e.getMessage();
        }
        
        
        
        // Create array list of test module
        ArrayList<String> lines = new ArrayList<String>();
        try {            
            for(String line : testModulelines){
                if(line.contains("[TEST_CASE]")){
                    for(String tcLine : testCaselines){
                        lines.add(tcLine);
                    }
                } else {
                    lines.add(line);
                }
            }            

        } catch(Exception e){
            String message = e.getMessage();
        }    
        
        
        // Add setup and tearDown
        try {            
            Path setupPath = FileSystems.getDefault().getPath("src\\doh_template","SetupTemplate.js");
            List<String> setupTemp = Files.readAllLines(setupPath.toAbsolutePath(), Charset.defaultCharset());
            
            Path tearDownPath = FileSystems.getDefault().getPath("src\\doh_template","TearDownTemplate.js");
            List<String> tearDownTemp = Files.readAllLines(tearDownPath.toAbsolutePath(), Charset.defaultCharset());
            Joiner j;
            j = Joiner.on("\n");
            String setup = j.join(setupTemp);
            String tearDown = j.join(tearDownTemp);
            
            for(int i = 0; i<lines.size(); i++) {
                if(lines.get(i).contains("[SETUP]")){
                    lines.set(i, setup);
                } else if(lines.get(i).contains("[TEARDOWN]")){
                    lines.set(i, tearDown);
                }                
            }
            
            for(int i = 0; i<lines.size(); i++) {
                if(lines.get(i).contains("[FUNCTION_NAME]")){
                    String tmpLine = lines.get(i).replace("[FUNCTION_NAME]", this.funcName);   
                    lines.set(i, tmpLine);
                }  
                
                if(lines.get(i).contains("[ITERATION]")){
                    String tmpLine = lines.get(i).replace("[ITERATION]", this.iteration);   
                    lines.set(i, tmpLine);
                } 
                
                if(lines.get(i).contains("[TEST_ID]")){
                    String tmpLine = lines.get(i).replace("[TEST_ID]", this.testId);   
                    lines.set(i, tmpLine);
                } 
            }            

        } catch(Exception e){
            String message = e.getMessage();
        }    
        
        this.generateTestCaseFile(lines);
    }
    
    private void generateTestCaseFile(ArrayList<String> lines){
        try {
            Path tcPath = Paths.get(this.tcFile);
            Path testsFolder = Paths.get(tcPath.getParent().toString());
            if(!Files.exists(testsFolder)){
                    Files.createDirectory(testsFolder);
            }
        }
        catch (IOException e){
            e.getMessage();
        }
        
        try {            
            FileWriter writer = new FileWriter(this.tcFile);
            System.out.println(this.tcFile);
            for(String l: lines){            
                writer.write(l + "\n");
                //System.out.println(l);
            }            
            
            
            writer.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }        
        
        
        // Find path of test case, compare to /Explorer/Runtime/Explorer.SharedResources/javascript/dojo/src/util/doh/
        /*
        * @param targetPath targetPath is calculated to this file
        * @param basePath basePath is calculated from this file
        * @param pathSeparator directory separator. The platform default is not assumed so that we can test Unix behaviour when running on Windows (for example)
        * @return
        * 
        private ArrayList<String> JS_PATHS = new ArrayList<String>(Arrays.asList(
            "space,../../../../../../Content/Space/javascript/src",
            "rts,../../../src/rts",
            "shared,../../../src/shared"));
        */

        
        String rtsPath = "D:\\Explorer\\Runtime\\Explorer.SharedResources\\javascript\\src\\rts\\ccf";
        String relative = ResourceUtils.getRelativePath(rtsPath, JSCOVERAGE_RUNNER , "\\");
        Path scriptDir = Paths.get(this.testedFile).getParent();
        //String relative = ResourceUtils.getRelativePath(scriptDir.toString(), JSCOVERAGE_RUNNER , "\\");
        relative = relative.replaceFirst("\\.\\.\\\\", "");
        // relative == "stuff/xyz.dat"
        this.testPath = relative;

        //addPath(this.testCasePath);
        //JS_PATHS.add(relative);
    }
    
    private void addPath(String path){
        JS_PATHS.add(path);
    }
    
    private String generateParam(String[] params){
        ArrayList<String> paramList = new ArrayList<String>();
                
        for(String param: params){
            if("".equals(param)){
                return "";
            }
            String[] paramMap = param.split(":");            
            String type = paramMap[1];
            IParamGenerator gen = new generateByRandom();
            String str = gen.generateParam(type.toLowerCase());
            if(type.compareToIgnoreCase("string")==0){
                str = "\"" + str + "\"";
            }
            paramList.add(str);            
        }        

        // build series of parameter, separate each param by comma
        String genParams = "";
        if(paramList.size() > 0){
            genParams = paramList.get(0);
            for(int i=1; i< paramList.size(); i++){            
                genParams = genParams + "," + paramList.get(i);
            }            
        }
        return genParams;
    }
    
    public void execute(){
        try {
            String dohRunner = "http://localhost/Explorer/Runtime/Explorer.SharedResources/javascript/dojo/src/util/doh/runner.html?";
            
            String nameSpace = "";
            String moduleName = "";
            String modulePath = "";
            String testModule;
            
            if(!this.module.equals("")){
                int firstPeriod = this.module.indexOf("/");
                int lastPeriod = this.module.lastIndexOf("/");
                
                nameSpace = this.module.substring(0,firstPeriod);
                modulePath = this.module.substring(0 ,lastPeriod);
                moduleName = this.module.substring(lastPeriod + 1, this.module.length());
            }
                    
            
            if(nameSpace.equals("space")){
                testModule = "&test=" +  modulePath + "/tests/" + moduleName;
            } else {
                moduleName = Paths.get(this.tcFile).getFileName().toString();
                moduleName = moduleName.substring(0,moduleName.lastIndexOf("."));
                testModule = "&test=space/tests/" + moduleName;            
            }
            
            
            
            //testModule = "";
            
            // path = path to root namespace
            // test module = root namespace/subnamespace/tests/moduleName
            
            String pathName = moduleName;
            String pathValue= "";
            
            String path = "paths=";
            
            // Add current tested file to path
            for(String p : JS_PATHS){
                path = path + p + ";";
            }
            
            // Remove the last ;  ... to avoid js error in DOH runner
            path = path.substring(0, path.length()-1);
            
            String testUrl = dohRunner + path + testModule;            
            testUrl = URLEncoder.encode(testUrl,"UTF-8");
            
            String runnerUrl = "http://localhost/Explorer/Runtime/Explorer.SharedResources/javascript/dojo/src/util/doh/jstest-coverage-runner.html";
            runnerUrl = runnerUrl + "?testUrl=" + testUrl;
            
            //java.awt.Desktop.getDesktop().browse(new URI(runnerUrl));
            
            chrome = Runtime.getRuntime().exec(CHROMEBIN + " --new-window " + runnerUrl);
            
        } catch (Exception ex) {
            Logger.getLogger(TestModule.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void close(){
        this.chrome.destroy();
    }
    
    
}