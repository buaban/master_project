package jstestcoverageui;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pannawat.janthong
 */
public class DOHTestCase {
    public DOHTestCase(String fileName,String funcName, int lineStart, int lineEnd, String[] param){
        ArrayList<String> testScript = new ArrayList<String>();
        
        System.out.println(fileName + " || " + funcName + " || " + lineStart + " || " + lineEnd + " || " + param);
        
        
        
        
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