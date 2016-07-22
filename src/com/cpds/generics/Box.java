/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.generics;

/**
 *
 * @author dml
 */
public class Box <T> 
{
    public void set(T t) {
        
    }
    
    public static void main(String ...args) {
        Box box = new Box();
        Box<Boolean> booleans = new Box<>();
        box = booleans;
        booleans = box;
        
        System.out.println( box );
    }
}
