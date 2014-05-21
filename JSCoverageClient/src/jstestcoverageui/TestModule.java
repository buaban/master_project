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
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.generateByRandom;
import utils.IParamGenerator;
/**
 *
 * @author pannawat.janthong
 */
public class DOHTestCase {
    static int LOOP = 5;
    private String tcFile;    
    Process chrome;
    static String CHROMEBIN = System.getenv("CHROME_BIN");
    
    public DOHTestCase(String testedFile, String instrumentFile, String modulePath,String objectName, String funcName, String[] params){
        ArrayList<String> testScript = new ArrayList<String>();
        ArrayList<String> paramSeriesList = new ArrayList<String>();

        String[] moduleName = objectName.split("\\.");
        if(moduleName.length > 1){
            objectName = moduleName[1];
        } else {
            objectName = moduleName[0];
        }
        
        modulePath = modulePath.replaceAll("\\.", "/");
        
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
                    line = line.replace("[ITERATION]", ""+t+l);
                    line = line.replace("[MODULE_LOADER]", objectName);
                    line = line.replace("[FUNCTION_NAME]", funcName);                
                    line = line.replace("[PARAMETERS]", paramSeriesList.get(l)); 
                    
                    testCaselines.add(line);
                } 
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
                line = line.replace("[MODULE_PATH]", modulePath);
                line = line.replace("[MODULE_LOADER]", objectName);                
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
            e.getMessage();
        }         
    }
    
    
    private String generateParam(String[] params){
        ArrayList<String> paramList = new ArrayList<String>();
                
        for(String param: params){
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
            String path = "paths=";

            String[] paths = {
                "space,../../../../../../Content/Space/javascript/src",
                "rts,../../../src/rts",
                "shared,../../../src/shared"
            };
            
            for(String p : paths){
                path = path + p + ";";
            }
            path = path.substring(0, path.length()-1);
            
            

            String testModule = "&test=space/tests/commonUtils";


            String testUrl = dohRunner + path + testModule;
            //testUrl = "http://localhost/Explorer/Runtime/Explorer.SharedResources/javascript/dojo/src/util/doh/runner.html?paths=sample,../js/sample&test=sample/tests/testJS";
            testUrl = URLEncoder.encode(testUrl,"UTF-8");
            
            String runnerUrl = "http://localhost/Explorer/Runtime/Explorer.SharedResources/javascript/dojo/src/util/doh/jstest-coverage-runner.html";
            runnerUrl = runnerUrl + "?testUrl=" + testUrl;
            
            //java.awt.Desktop.getDesktop().browse(new URI(runnerUrl));
            
            chrome = Runtime.getRuntime().exec(CHROMEBIN + " --new-window " + runnerUrl);
            
        } catch (Exception ex) {
            Logger.getLogger(DOHTestCase.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void close(){
        this.chrome.destroy();
    }
    
    
}