package com.jscoverage.instrumentor.determineparam;

public abstract class IDetermineParamType {
	protected String param;
	protected String funcBody;	
	
	protected IDetermineParamType(String funcBody, String param){		
		this.funcBody = funcBody;
		this.param = param;		
	}
	
	public abstract String execute();
	
}
