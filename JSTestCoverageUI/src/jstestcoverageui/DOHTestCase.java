package jstestcoverageui;

import java.io.File;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pannawat.janthong
 */
public class DOHTestCase {
    public DOHTestCase(String modulePath,String funcName, int lineStart, int lineEnd, String[] param){
        ArrayList<String> testScript = new ArrayList<String>();
        
        //System.out.println(filePath + " || " + funcName + " || " + lineStart + " || " + lineEnd + " || " + param);
        
        try {
            List<String> lines;
            Path p = FileSystems.getDefault().getPath("src\\doh_template","DOHTemplate.js");
            lines = Files.readAllLines(p.toAbsolutePath(), Charset.defaultCharset());
            //File f = new File(filePath);
            
            //String fileName = f.getName();
            //String parentName = f.getParentFile().getName();
            //String moduleName = fileName.replace(".js", "");
            
            int lineNum = lines.size();
            for(int i = 0; i<lineNum; i++) {
                String line = lines.get(i);
                line = line.replace("[MODULE_PATH]", modulePath);
                line = line.replace("[MODULE_LOADER]", modulePath);
                line = line.replace("[FUNCTION_NAME]", funcName);                
                lines.set(i, line);
            }
            
            for(int i = 0; i<lineNum; i++) {
                System.out.println(lines.get(i));
            }
        } catch(Exception e){
            e.getMessage();
        }
        
        
        /*
        try{
        FileWriter writer = new FileWriter("test");
        for(String l: testScript){
        l = l + "\r\n";
                writer.write(l);

        }	
        writer.close();
        } catch(Exception e){
        
        }
        */
        
        
    }
}