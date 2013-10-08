/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author pannawat.janthong
 */
public class generateByRandom implements IParamGenerator {
    private String param;
            
    public String generateParam(String type){
        return this.generateParam(type,Integer.parseInt(RandomStringUtils.randomNumeric(1)));
    }
    
    public String generateParam(String type, int length){        
        switch(type){
            case "string"   
                :   param = generateString(length);
                    break
                ;
            case "number"
                :   param = generateInteger(length);
                    break
                ;
            default 
                :   param = generateInteger(length);
                    break
                ;
                
        }
        return param;
    }
    
    
    private String generateString(int length){
        return RandomStringUtils.randomAlphabetic(length);
    }
    
    private String generateInteger(int length){
        String numStr = RandomStringUtils.randomNumeric(length);
        Integer number = Integer.parseInt(numStr);
        return number.toString();
    }
    
}
