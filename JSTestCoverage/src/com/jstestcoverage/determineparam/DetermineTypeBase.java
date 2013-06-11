package com.jstestcoverage.determineparam;

public abstract class DetermineTypeBase {
	protected String param;
	protected String funcBody;	
	
	protected DetermineTypeBase(String funcBody, String param){		
		this.funcBody = funcBody;
		this.param = param;		
	}
	
	public abstract String execute();
	
}
