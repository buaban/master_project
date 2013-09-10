package com.jstestcoverage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.google.common.base.Joiner;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashBasedTable;
import com.yahoo.platform.yuitest.coverage.DirectoryInstrumenter;
import com.yahoo.platform.yuitest.coverage.FileInstrumenter;

public class JSCoverage {
	ArrayList<ArrayList<String>> functionList;
	
	public JSCoverage(String input){
		Boolean isDirectory = false;
		String outputLocation;
		isDirectory = IsPathDirectory(input);
		functionList = new ArrayList<ArrayList<String>>();
		
		/*   Instrument files       */
		try {
			if (isDirectory){			
				outputLocation = input;
	            DirectoryInstrumenter.instrument(input, outputLocation);
	        } else {  	
	        	Path inputPath = Paths.get(input);
	        	// 1 Create original folder to store original source code
	        	Path oriFolder = Paths.get(inputPath.getParent().toString()+"\\original");
	        	if(!Files.exists(oriFolder)){
	        		Files.createDirectory(oriFolder);
	        	}	
	        	
	        	// 2 instrument file and move original src to original folder
	        	instrumentFile(input);
	        	
	        	// 3 Add number of code lines of each function to _yuitest_coverfunc in instrumented code 
	        	addNumberOfLines(input);
	        	
	        	// 4 Create Functions List
	        	createFunctionList(input);
	        	
	        }
		} catch (Exception e) {
            e.printStackTrace();
            // Return a special error code used specifically by the web front-end.
            System.exit(1);        
        }		
		
	}
	
	
	public JSCoverage(String input, boolean devMode){
		Boolean isDirectory = false;
		String outputLocation;
		isDirectory = IsPathDirectory(input);
		functionList = new ArrayList<ArrayList<String>>();
		outputLocation = UUID.randomUUID().toString()+".js";
		
		
		/*   Instrument files       */
		try {
			if (isDirectory){			
				outputLocation = input;
	            DirectoryInstrumenter.instrument(input, outputLocation);
	        } else {  	
	        	Path inputPath = Paths.get(input);
	        	// 1 Create original folder to store original source code
	        	Path oriFolder = Paths.get(inputPath.getParent().toString()+"\\original");
	        	if(!Files.exists(oriFolder)){
	        		Files.createDirectory(oriFolder);
	        	}	
	        	outputLocation = Paths.get(inputPath.getParent().toString()).toString()+"\\"+outputLocation;
	        	// 2 instrument file and move original src to original folder
	        	instrumentFile(input, outputLocation);
	        	
	        	// 3 Add number of code lines of each function to _yuitest_coverfunc in instrumented code 
	        	addNumberOfLines(outputLocation);
	        	
	        	// 4 Create Functions List
	        	createFunctionList(outputLocation);
	        	
	        }
		} catch (Exception e) {
            e.printStackTrace();
            // Return a special error code used specifically by the web front-end.
            System.exit(1);        
        }		
		
	}
	
	
	
	
	
	public ArrayList<ArrayList<String>> getFunctionList(){
		return this.functionList;
	}
	
	
	private void addNumberOfLines(String fileName){
		List<String> lines = null;
    	StringBuilder code = new StringBuilder();
    	
    	try {
    		lines = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());
    		int lineNum = lines.size();
    		for(int i = 0; i<lineNum; i++) {
    			String line = lines.get(i);
    			String lastCoverLine = "";
    			String firstCoverLine = "";
    			if(line.contains("_yuitest_coverfunc(")){
    				int j = i+1;
    				firstCoverLine = "";
    				for(;j<lineNum;j++){
    					String subLine = lines.get(j);
    					
    					if(subLine.contains("_yuitest_coverline(")){
    						String txt = subLine.substring(subLine.indexOf("("), subLine.lastIndexOf(")"));
    						
    						if(firstCoverLine==""){
    							firstCoverLine = txt.split(",")[1].trim();
    						}
    						
    						lastCoverLine = txt.split(",")[1].trim();
    					} else if(subLine.contains("_yuitest_coverfunc(")){
    						break;
    					}
    				}
    				
    				String[] tmpLine = line.split(",");
    				String funcLength = tmpLine[3].trim();
    				funcLength = firstCoverLine + ":" + lastCoverLine;
    				tmpLine[3] = "\"" + funcLength +"\"";
    				
    				Joiner jo = Joiner.on(",");
    				String newLine = jo.join(tmpLine);
    				lines.set(i, newLine);
    				i = j-1;    				
    			}
    		
    	    }
    		
    		FileWriter writer = new FileWriter(fileName);
    		for(String l: lines){
    	    	l = l + "\r\n";
	    		writer.write(l);
    	    	
	    	}	
    		writer.close();
    	} catch(Exception e){
    		
    	}
    	
    	
	}
		
	private void createFunctionList(String fileName){
		List<String> lines = null;		
		ArrayList<ArrayList<String>> funcList = new ArrayList<ArrayList<String>>();
		String moduleName = "";
		try {
    		lines = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());
    		for(String line : lines){  
    			if(!IsCommentLine(line) && line.contains("dojo.provide") && !line.contains("_yuitest")){
    				moduleName = line.substring(line.indexOf("(\"")+2, line.lastIndexOf("\")"));
    			} 
    			if(line.contains("_yuitest_coverfunc(")){
    				line = line.substring(line.indexOf("(")+1, line.lastIndexOf(")"));
    				String[] tmp = line.split(",");
    				ArrayList<String> func = new ArrayList<String>();
    				func.add(moduleName);
    				func.add(tmp[1].trim());
    				func.add(tmp[2].trim());
    				func.add(tmp[3].trim());
    				func.add(tmp[4].trim());
    				funcList.add(func);
    			} 
    		}
		} catch(Exception e){
			
		}
		
		this.functionList =  funcList;
	}
	
	private boolean IsCommentLine(String line){		
		if(line.trim().startsWith("/*") || line.trim().startsWith("//") ){
			return true;			
		}
		
		return false;
	}
	
	private boolean IsPathDirectory(String input) {
	    File test = new File(input);

	    // check if the file/directory is already there
	    if (!test.exists()) {
	        // see if the file portion it doesn't have an extension
	        return test.getName().lastIndexOf('.') == -1;
	    } else {
	        // see if the path that's already in place is a file or directory
	        return test.isDirectory();
	    }
	}
	
	private void instrumentFile(String input){
		
    	try {
    		// 1 Create temp file
    		Path inputPath = Paths.get(input);
        	Path tempPath = Paths.get(input+".tmp");
	    	Files.copy(inputPath, tempPath);
	    	
	    	// 2 Copy file to original folder
	    	Path oriFolder = Paths.get(inputPath.getParent().toString()+"\\original");
	    	Path oriFile = Paths.get(oriFolder.toString() + "\\" + Paths.get(input).getFileName());
	    	if(!Files.exists(oriFile)){
	    		Files.copy(Paths.get(input), oriFile);
	    	}
	    	
	    	// 3 Send temp file to instrumenter then replace original file	        	
	        FileInstrumenter.instrument(tempPath.toString(), inputPath.toString());
	        
	        // 4 Delete the temp file
	        Files.deleteIfExists(tempPath);
    	} catch(Exception e){
    		
    	}
	}
	
	private void instrumentFile(String input, String outputLocation){
		Path inputPath = Paths.get(input);
    	Path tempPath = Paths.get(input+".tmp");
    	
    	try {
    		// 1 Create temp file    		
	    	Files.copy(inputPath, tempPath);
	    	
	    	// 2 Copy file to original folder
	    	Path oriFolder = Paths.get(inputPath.getParent().toString()+"\\original");
	    	Path oriFile = Paths.get(oriFolder.toString() + "\\" + Paths.get(input).getFileName());
	    	if(!Files.exists(oriFile)){
	    		Files.copy(Paths.get(input), oriFile);
	    	}
	    	
	    	// 3 Send temp file to instrumenter and replace result to the input	        	
	        FileInstrumenter.instrument(tempPath.toString(), outputLocation);
	        
	        
    	} catch(Exception ex){
    		ex.getStackTrace();
    		ex.printStackTrace();
    	} finally {
    		// 4 Delete the temp file
	        try {
				Files.deleteIfExists(tempPath);
			} catch (IOException e) {
				e.printStackTrace();
			}    		
    	}
	}

}