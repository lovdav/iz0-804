/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.singleton;

/**
 *
 * @author dml
 */
public class LoggerSingleton 
{
    private static LoggerSingleton logger;
    
    private LoggerSingleton(){
        super();
    }
    
    public static LoggerSingleton getInstance(){        
        if (logger == null) {            
            synchronized (LoggerSingleton.class) {
                if (logger == null){
                    return new LoggerSingleton();
                }                
            }            
        }
        return logger;
    }
    
    public void log(String s){
        System.err.println(s);
    }
}

