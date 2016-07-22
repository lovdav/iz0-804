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
public class Regex2 {
    
    public static  void main(String []args)
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("David Montes Luna 29 años, fecha: 1985, CP:07164, correo: dml@hotmail.com  tel: 0445543463057 \n")
          .append("Israel Montes Luna 28 años, fecha: 1987, CP:07165, correo: iml@hotmail.com tel: 0445534625674 \n")
          .append("Ariana Montes Luna 15 años, fecha: 2000, CP:07167, correo: aml@hotmail.com tel: 0445508689236");
        
        System.out.println(" ======= Año =======");
        //expresion(sb.toString(), "\\b\\d{4}\\b");
        
        System.out.println(" ======= correo =======");
        //expresion(sb.toString(), "\\w+@\\w+\\.com");
        
        System.out.println(" ======= Edad =======");
        //expresion(sb.toString(), "\\b\\d{2,3}\\b");
        
        System.out.println(" ======= Telefono =======");
        formatear(sb.toString(), "\\b(\\d{3})(\\d{2})(\\d{8})\\b");
    }
    
    private static void expresion(String cadena, String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher  = pattern.matcher(cadena);
        while(matcher.find()) {
            System.out.println( matcher.group() );
        }
    }
    
    private static void formatear(String cadena, String regex)
    {
        Pattern patter = Pattern.compile(regex);
        Matcher matcher = patter.matcher(cadena);        
        
        String salida = null;
        if (matcher.find()) {
             salida = matcher.replaceAll("$1-$2-$3");
        }
        System.out.println(salida);
        
        
    }
}
