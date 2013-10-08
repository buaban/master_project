/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author pannawat.janthong
 */

/*
 * Param Types:
 * String: word, hash
 * Number: integer, double
 * Date, time
 * Boolean
 * 
 */
public interface IParamGenerator {
    public String generateParam(String type);
    public String generateParam(String type, int length);
}
