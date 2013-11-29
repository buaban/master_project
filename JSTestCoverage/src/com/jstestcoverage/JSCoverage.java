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
	String input;
	Boolean devMode = false;
	String insMode;
	String filePath;
	
	public JSCoverage(String input){
		this.input = input;
		this.startJSCoverage();
	}

	
	public JSCoverage(String input, String instrumentMode){
		this.input = input;
		this.devMode = devMode;
		this.startJSCoverage();
	}
	
	public JSCoverage(String input, String instrumentMode, boolean devMode){
		this.input = input;
		this.devMode = devMode;
		this.insMode = instrumentMode; // replace , new-folder 
		this.startJSCoverage();
	}
	
	private void startJSCoverage(){
		Boolean isDirectory = false;
		String outputLocation = "";
		String outputFileName = "";
		String outputFolder = "";
		isDirectory = IsPathDirectory(this.input);
		functionList = new ArrayList<ArrayList<String>>();
		
		
		/*   Instrument files       */
		try {
			if (isDirectory){			
				outputLocation = this.input;
	            DirectoryInstrumenter.instrument(this.input, outputLocation);
	        } else {  	
	        	Path inputPath = Paths.get(this.input);
	        	
	        	
	        	if(this.insMode.compareToIgnoreCase("replace")==0){
	    			outputFileName = inputPath.getFileName().toString();
	    			outputFolder = inputPath.getParent().toString();
	    			
	    			// 1 Create original folder to store original source code
		        	Path oriFolder = Paths.get(inputPath.getParent().toString()+"\\original");
		        	if(!Files.exists(oriFolder)){
		        		Files.createDirectory(oriFolder);
		        	}
		        	
			    	// 2 Check if file is already exists in oriFolder, then copy file to original folder
			    	Path oriFile = Paths.get(oriFolder.toString() + "\\" + outputFileName);
			    	if(!Files.exists(oriFile)){
			    		Files.copy(inputPath, oriFile);
			    	}
			    	
			    	outputLocation = outputFolder.toString() + "\\" + outputFileName.toString(); 
		        	
	    		} else if(this.insMode.compareToIgnoreCase("new-folder")==0){
	    			outputFileName = inputPath.getFileName().toString();
	    			outputFolder = inputPath.getParent().toString()+ "\\instruments-code";
	    			
	    			// 1 Create instrument-code folder to store instrumented source code
		        	Path instFolder = Paths.get(outputFolder);
		        	if(!Files.exists(instFolder)){
		        		Files.createDirectory(instFolder);
		        	}
		        	outputLocation = outputFolder.toString() + "\\" + outputFileName.toString();
	    		}
	    		
	    		if(devMode){
	    			outputLocation = inputPath.getParent().toString()+ "\\" + UUID.randomUUID().toString()+".js";	
	    		}
	    		
	    		this.filePath = outputLocation;
	        		
	        	instrumentFile(this.input, outputLocation);
	        	
	        	// 3 Add number of code lines of each function to _jstestcoverage_func in instrumented code 
	        	addNumberOfLines(outputLocation);
	        	
	        	// 3.x add new line to _cover_line
	        	addNewLine(outputLocation);
	        	
	        	// 3.x replace .tmp
	        	removeTmp(outputLocation);
	        	
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
	
	public String getTestCaseFilePath(){
		return filePath;		
	} 
	
	private void removeTmp(String fileName){
		List<String> lines = null;
    	StringBuilder code = new StringBuilder();
    	
    	try {
    		lines = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());
    		int lineNum = lines.size();
    		for(int i=0; i<lineNum ;i++) {
    			String line = lines.get(i);
    			if( (line.contains("_jstestcoverage_func(") || line.contains("_jstestcoverage_line(")) && line.contains(".tmp")   ){
    				line = line.replace(".tmp", "");
    				lines.set(i, line);
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
	
	private void addNumberOfLines(String fileName){
		List<String> lines = null;
    	StringBuilder code = new StringBuilder();
    	
    	try {
    		lines = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());
    		int lineNum = lines.size();
    		for(int i = 0; i<lineNum; i++) {
    			String line = lines.get(i);
    			String currentFunc = "";
    			String lastCoverLine = "";
    			String firstCoverLine = "";
    			if(line.contains("_jstestcoverage_func(") && !line.contains("\"(anonymous") ){
    				String funcName = "";
    				String tmpFuncLine="";
    				tmpFuncLine = line.substring(line.indexOf("(")+1, line.lastIndexOf(")"));    				
    				String[] tmp = tmpFuncLine.split(",");
    				// function name
    				funcName = tmp[2].trim().replace("\"", "");
    				
    				int j = i+1;
    				int lastIndex = i+1;
    				firstCoverLine = "";
    				for(;j<lineNum;j++){
    					String subLine = lines.get(j);
    					
    					if(subLine.contains("_jstestcoverage_line(")){
    						
    						String txt = subLine.substring(subLine.indexOf("("), subLine.lastIndexOf(")"));
    						String subFuncName = "";
    	    				txt = txt.replace("\"", "");
    	    				String[] tmpSub = txt.split(",");
    	    				// function name
    	    				subFuncName = tmpSub[1].trim();
    	    						
    						if(firstCoverLine=="" && (funcName.equals(subFuncName))){
    							firstCoverLine = tmpSub[2].trim();
    						}
    						
    						if(funcName.equals(subFuncName)){
    							lastCoverLine = tmpSub[2].trim();
    							lastIndex = j;
    						}
    					} else if(j>i+100){
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
    				i = lastIndex-1;    				
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
	
	private void addNewLine(String fileName){
		List<String> lines = null;    	
    	
    	try {
    		lines = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());
    		int lineNum = lines.size();
    		for(int i = 0; i<lineNum; i++) {
    			String line = lines.get(i);
    			if(line.contains("_jstestcoverage_line(") && !line.trim().startsWith("_jstestcoverage_line")){
    				String[] addNewLine = line.split("_jstestcoverage_line");    							    							
					lines.set(i, addNewLine[0] + "\r\n" + "_jstestcoverage_line" + addNewLine[1]);    							
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
    			if(!IsCommentLine(line) && line.contains("dojo.provide") && !line.contains("_yuitest") && !line.contains("_jstestcoverage")){
    				moduleName = line.substring(line.indexOf("(\"")+2, line.lastIndexOf("\")"));
    			} 
    			if(line.contains("_jstestcoverage_func(") && !line.contains("\"(anonymous") ){
    				line = line.substring(line.indexOf("(")+1, line.lastIndexOf(")"));
    				String[] tmp = line.split(",");
    				ArrayList<String> func = new ArrayList<String>();
    				// tested file
    				func.add(this.input);
    				// instrumented file
    				func.add(fileName.replace(".tmp",""));
    				// module name
    				func.add(moduleName);
    				// object name
    				func.add(tmp[1].trim());
    				// function name
    				func.add(tmp[2].trim());
    				// lines
    				func.add(tmp[3].trim());
    				// parameters
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