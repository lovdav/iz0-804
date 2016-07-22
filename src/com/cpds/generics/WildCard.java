/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.generics;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dml
 */
public class WildCard 
{
    static public void main(String ...args) {
        WildCard wc = new WildCard();
        List<?> list = new ArrayList<Integer>();
        list = new ArrayList<String>();
        list = new ArrayList<Object>();
        
        List<? extends Number> listNumbers = new ArrayList<Number>();
        listNumbers = new ArrayList<Number>();
        listNumbers = new ArrayList<Integer>(); //Para evitar error de compilación,
        listNumbers = new ArrayList<Float>();   //pero no se pueden utilizar métodos que modifique el objeto
        
        //listNumbers.add( 4 );        
        //listNumbers = new ArrayList<String>(); // EC
        
        List<Integer> enteros = new ArrayList<>();
        enteros.add( new Integer(90) );
        
        List<Double> dobles = new ArrayList<>();
        dobles.add( new Double(40) );
        
        wc.suma(listNumbers);
        wc.suma(dobles);
        
        Number s = new Double(20);        
        List<? super Integer> foo3 = new ArrayList<Integer>();
        foo3.add(new Integer(2));
        
        List<? super Integer> enteros2 = new ArrayList<Number>();
        enteros2 = new ArrayList<Integer>();
        //enteros2.add(s);
        enteros2.add(s.intValue());
    }
    
    public void suma(List< ? extends Number> numbers) {
        for (Number n : numbers) {
            System.out.println(n.intValue());
        }
    }
    
    
    
}
