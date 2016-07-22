/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dml
 */
public class TestPairs {
    
    public static void main(String args[]) {
        Pairs<String, BigDecimal> pairs = new Pairs<>("Clave",BigDecimal.TEN);
        System.out.println("Clave: " + pairs.getFirst() + " valor: " + pairs.getSecond());
        
        List<Integer> list = new ArrayList<Integer>();
        //List<Number> list2 = new ArrayList<Integer>();
        
        
    }
    
}
