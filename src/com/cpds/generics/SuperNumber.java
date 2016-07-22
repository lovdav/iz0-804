/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.generics;

import java.util.List;

/**
 *
 * @author dml
 */
public class SuperNumber<T,S extends Pairs<T,T> > 
{
    private List<? super T> lista;
    
    public static<T> List<T> nCopies(int num, T obj) {
        
        return null;
    }
    
    public <T> List<T> nCopies2(int num, T obj) {
        
        return null;
    }

    public static void main(String ...args) {
        List<Integer> enteros = SuperNumber.<Integer>nCopies(2, new Integer(10));
        
        SuperNumber<String, Pareja<String, String>> superNumber = new SuperNumber();
        List<Integer> cadenas = superNumber.<Integer> nCopies2(2, 45);
        
    }
    
}
