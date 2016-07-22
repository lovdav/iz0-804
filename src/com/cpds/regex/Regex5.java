/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dml
 */
public class Regex5 
{
    public static void main(String ...args) 
    {
        String patron = "[0-9]{1,3}(,([0-9]{3}))*(.[0-9]+)?";
        //String patron = "^\\d{0,2}(\\.\\d{1,2})?$";
        //String patron = "^\\d{0,2}\\.{0,1}(\\d{1,2})?$";
        //String patron = "^(\\d{0,2})(\\.)?(\\d{1,2})?$";
        //String patron = "^(\\d{0,2})(\\.)?(\\d{1,2})?(\\d{1,2})?$";
        
        String test[] = {"3,001","1","32,012,111.2131","123//264798", 
                        "32,012,11.2131", "1132,012,111.2131", "32,0112,111.2131","32131"};
        
        for (int i=0; i<test.length; i++) {
            expresion(test[i], patron);
        }
        
        expresion("5.",patron);
        expresion(".67",patron);
        expresion("56",patron);
        expresion("56.78",patron);
        expresion("56.789",patron);
        expresion("34678",patron);
        expresion("346",patron);
        expresion("67.",patron);
        expresion("1.6",patron);
        expresion("5.00",patron);
        expresion("888.67",patron);
        expresion("1.6",patron);
        expresion("67.09",patron);
        expresion("333.88",patron);
        expresion("56.90.",patron);
        expresion("56.9.0",patron);
    }
    
    private static void expresion(String cadena, String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher  = pattern.matcher(cadena);
        
        while(matcher.find()) {
            //System.out.println( matcher.group() );
        }
        
        /*int grupo = matcher.groupCount();
        for (int i=1; i<= grupo; i++){
            System.out.println("Grupo " + i + ": " + matcher.group(i));
        }*/
        
        System.out.println(cadena + " - " + matcher.matches());
    }
}
