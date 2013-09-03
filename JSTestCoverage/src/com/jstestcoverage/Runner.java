package com.jstestcoverage;

import java.util.ArrayList;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean devMode = true;
		JSCoverage jsc = new JSCoverage("D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\input\\input_b.js", devMode);
		//JSCoverage jsc = new JSCoverage("D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\input\\input_x.js", devMode);
		ArrayList<ArrayList<String>> test = jsc.getFunctionList();
		//y.replace(":","");
		for(ArrayList func : test){
            if(func.size()>0){
                String funcName = (String)func.get(1);
                funcName = funcName.replaceAll("\"", "");
                String param = (String)func.get(3);
                param = param.replaceAll("\"", "");
                String obj = (String)func.get(0);
                obj = obj.replaceAll("\"", "");
                String lines = (String)func.get(2);
                lines = lines.replaceAll("\"", "");
                System.out.println("Object: "+ obj  + " | Function: " + funcName + " | Lines: " + lines + " | Parameter:" + param);
                
            }
        }
	}

}