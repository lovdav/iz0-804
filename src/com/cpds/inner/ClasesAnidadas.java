/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.inner;

/**
 *
 * @author dml
 */
public class ClasesAnidadas 
{
    static public void main(String argd[]) {
        ClasesAnidadas ca = new ClasesAnidadas();
        Object o = ca.foo();
        System.out.println(o);
    }
    
    public Object foo()
    {
        return new Object(){
            @Override
            public String toString(){
                return "cadena";
            }
        };
    }
}
