package com.jstestcoverage.determineparam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetermineByMethod extends DetermineTypeBase {

	static final ArrayList<String> STRINGTYPE = new ArrayList<String>(Arrays.asList(
			"[PARAM_NAME]\\.anchor\\(",
			"[PARAM_NAME]\\.big\\(",
			"[PARAM_NAME]\\.blink\\(",
			"[PARAM_NAME]\\.bold\\(",
			"[PARAM_NAME]\\.fixed\\(",
			"[PARAM_NAME]\\.fontcolor\\(",
			"[PARAM_NAME]\\.fontsize\\(",
			"[PARAM_NAME]\\.italics\\(",
			"[PARAM_NAME]\\.link\\(",
			"[PARAM_NAME]\\.small\\(",
			"[PARAM_NAME]\\.strike\\(",
			"[PARAM_NAME]\\.sub\\(",
			"[PARAM_NAME]\\.sup\\(",
			"[PARAM_NAME]\\.charCodeAt\\(",
			"[PARAM_NAME]\\.fromCharCode\\(",
			"[PARAM_NAME]\\.indexOf\\(",
			"[PARAM_NAME]\\.lastIndexOf\\(",
			"[PARAM_NAME]\\.match\\(",
			"[PARAM_NAME]\\.search\\(",
			"[PARAM_NAME]\\.splice\\(",
			"[PARAM_NAME]\\.substring\\(", 
			"[PARAM_NAME]\\.substr\\(", 
			"[PARAM_NAME]\\.charAt\\(", 
			"[PARAM_NAME]\\.concat\\(",
			"[PARAM_NAME]\\.toLowerCase\\(",
			"[PARAM_NAME]\\.toUpperCase\\(",
			"[PARAM_NAME]\\.split\\(",
			"[PARAM_NAME]\\.replace\\("
			));

	static final ArrayList<String> NUMBERTYPE = new ArrayList<String>(Arrays.asList(
			"[PARAM_NAME]\\.toFixed\\(", 
			"[PARAM_NAME].toExponential\\(",
			"[PARAM_NAME].toPrecision\\("
			));		
	
	public DetermineByMethod(String funcBody, String param) {
		super(funcBody, param);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		
		for (String ruleTemplate : STRINGTYPE) {
			String rule = ruleTemplate.replace("[PARAM_NAME]", super.param);			
    		Pattern pattern = Pattern.compile(rule);
    	    Matcher matcher = pattern.matcher(super.funcBody);
    	    
    	    if(matcher.find()){    	
    	    	return "String";
  	
    	    } else {
    	    	//System.out.println("Param:" + param + " not found " + " Pattern:" + rule + " body: "+this._funcBody);
    	    	//System.out.println("body: "+this._funcBody);
    	    	
    	    }
		}
		
		for (String ruleTemplate : NUMBERTYPE) {
			String rule = ruleTemplate.replace("[PARAM_NAME]", super.param);
    		Pattern pattern = Pattern.compile(rule);
    	    Matcher matcher = pattern.matcher(super.funcBody);
    	    
    	    if(matcher.find()){
    	    	return "Number";
    	    } else {
    	    	//System.out.println("Param:" + param + " is undefine type " + "Pattern:" + rule);
    	    }
		}
		

		return null;
	}


}
