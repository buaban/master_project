package com.jscoverage.instrumentor;

import java.util.ArrayList;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean devMode = true;
		Instrumentor jsc = new Instrumentor("D:\\Explorer\\Content\\Space\\javascript\\src\\testDetermineParam.js", "replace",devMode);
		
		ArrayList<ArrayList<String>> test = jsc.getFunctionList();
		
		for(ArrayList func : test){
            if(func.size()>0){
                String funcName = (String)func.get(4);
                funcName = funcName.replaceAll("\"", "");
                String param = (String)func.get(6);
                param = param.replaceAll("\"", "");
                String obj = (String)func.get(3);
                obj = obj.replaceAll("\"", "");
                String lines = (String)func.get(5);
                lines = lines.replaceAll("\"", "");
                System.out.println("Object: "+ obj  + " | Function: " + funcName + " | Lines: " + lines + " | Parameter:" + param);                
            }
        }
	}

}