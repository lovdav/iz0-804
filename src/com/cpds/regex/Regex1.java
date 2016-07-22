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
public class Regex1 
{
    public static void main(String ...args)
    {
        String str = 
        "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone," +
        "Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank post" +
        "office, Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.";
        
        cadenasCaracteres(str);
        soloNumeros(str);
        
        System.out.println(" ======= Código Postal [5 digitos] ====== ");
        expresion(str, "[0-9]{5}");
        System.out.println(" ======= Termina ====== ");
    }
    
    private static void cadenasCaracteres(String cadena){
        System.out.println(" ======= Cadenas Caracteres ====== ");
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(cadena);
        
        while ( matcher.find() ) {
            System.out.println( matcher.group() );
        }
    }
    
    private static void soloNumeros(String cadena)
    {
        System.out.println(" ======= Numericos ====== ");
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(cadena);
        while(matcher.find()) {
            System.out.println( matcher.group() );
        }
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
