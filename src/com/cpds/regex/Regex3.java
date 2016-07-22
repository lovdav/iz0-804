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
public class Regex3 
{
    public static  void main(String []args)
    {
        String ip1 = "192.168.205.1";
        String ip2 = "192.168.207.260";
        String ip3 = "10.100.79.218";
        
        System.out.println(ip1 + ": " + validarIP(ip1) ); 
    }
    /**
     * 4 numeros separados por .
     * cada numero pued contener entre 0 y 255
     * 
     * 
     * @param ip
     * @return 
     */
    public static boolean validarIP(String ip){
        String s = "\\b((25[0–5]|2[0–4]\\d|[01]?\\d\\d?)(\\.)){3}(25[0–5]|2[0–4]\\d|[01]?\\d\\d?)\\b";
        Pattern pattern = Pattern.compile("\\b(\\d{3}.)(\\d{3}.)(\\d{3}.)(\\d{1})\\b");        

        Matcher matcher = pattern.matcher(ip);
        
        while(matcher.find()){
            System.out.println( matcher.group(1) +  " " + matcher.group(2) + " " + matcher.group(3) + " " + matcher.group(4));
        }
        
        return matcher.matches();
    }
}
