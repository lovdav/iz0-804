/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.exception;

/**
 *
 * @author dml
 */
public class TestException implements Automovil
{

    @Override
    public void run() throws RuntimeException {
        Object o = null;
        
        System.out.println("corre");
    }
    
    
    public static void main(String args[]){
        TestException te = new TestException();
        te.run();
    }
}

interface Automovil {
    void run();
}
