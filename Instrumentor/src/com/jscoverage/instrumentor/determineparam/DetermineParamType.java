package com.jscoverage.instrumentor.determineparam;
import java.util.ArrayList;
import java.util.Arrays;


public class DetermineParamType {	
	String funcBody;
	ArrayList<String> paramsList;
	ArrayList<String> funcLines;
	String paramType;

	
	public DetermineParamType(String funcBody, String params){		
		this.funcBody = funcBody;
		this.funcLines = new ArrayList<String>(Arrays.asList(funcBody.split("[\\n]")));
		this.paramType = "";		
		
		String[] paramArray = {};		
		if(!params.equals("")){
			paramArray = params.split(",");			
		}
		this.paramsList = new ArrayList<String>(Arrays.asList(paramArray));
	}
	
	public String determineTypes(){
		int i=0;
		for(String param : this.paramsList) {
			if(param.isEmpty()){
				return null;
			} else {
				if(i==0) {
					this.paramType = param + ":" + this.determineType(param);
				} else {
					this.paramType += "|" + param + ":" + this.determineType(param);
				}
				i++;
			}
    	}
	    
		return this.paramType;	
	} 
	
	private String determineType(String param){		
		String type;
		
		
		IDetermineParamType dm = new DetermineByMethod(this.funcBody,param);
		type = dm.execute();	
		if(type!=null){
			return type;
		} else {
			IDetermineParamType dop = new DetermineByOperator(this.funcBody,param);
			type = dop.execute();	
			
			if(type!=null){
				return type;
			} else {
				IDetermineParamType dp = new DetermineByParam(this.funcBody,param);
				type = dp.execute();	
				if(type!=null){
					return type;
				}
			}
		}		
				
		return null;
	}
	
}
