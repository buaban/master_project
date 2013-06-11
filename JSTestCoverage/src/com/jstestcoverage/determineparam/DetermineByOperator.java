package com.jstestcoverage.determineparam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetermineByOperator extends DetermineTypeBase {

	static final ArrayList<String> OPERATOR_NUMBER = new ArrayList<String>(Arrays.asList(
			"+",
			"-", 
			"*",
			"/",
			"%",
			">",
			"<", 
			">=",
			"<=",
			">>",
			"<<",
			">>>",
			"<<<",
			"--",
			"++"
			));		
	
	public DetermineByOperator(String funcBody, String param) {
		super(funcBody, param);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		
		for (String operator : OPERATOR_NUMBER) {
			String rule1 = "\\" + operator + "(\\s)*" + super.param;
			String rule2 = super.param + "(\\s)*" + "\\" + operator;
    		Pattern pattern1 = Pattern.compile(rule1);
    	    Matcher matcher1 = pattern1.matcher(super.funcBody);
    	    Pattern pattern2 = Pattern.compile(rule2);
    	    Matcher matcher2 = pattern2.matcher(super.funcBody);
    	    
    	    if(matcher1.find() || matcher2.find()){    	
    	    	return "Number";
    	    } else {
    	    	//System.out.println("Param:" + param + " not found " + " Pattern:" + rule + " body: "+this._funcBody);
    	    	//System.out.println("body: "+this._funcBody);
    	    	
    	    }
		}
	
		return null;
	}

}
