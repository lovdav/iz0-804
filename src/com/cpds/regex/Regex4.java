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
public class Regex4 
{
    
    public static  void main(String []args)
    {
        String s = "El caalendario de autos";
        //expresion(s, "a+e*i?");
        //expresion("aaaaoooiooooaaooaaooaa", "((aa)(oo)(aa))");
        
        expresion("Los osos de la sel de oro y loro", "(o.o)");
    }
    
    private static void expresion(String cadena, String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher  = pattern.matcher(cadena);
        while(matcher.find()) {
            System.out.println( matcher.group() );
        }
    }
}
