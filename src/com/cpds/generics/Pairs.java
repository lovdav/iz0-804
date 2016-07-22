/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.generics;

/**
 *
 * @author dml
 * @param <T1>
 * @param <T2>
 */
public class Pairs<T1, T2>
{
    private T1 t1;
    private T2 t2;
    
    public Pairs(T1 one, T2 two) {
        this.t1 = one;
        this.t2 = two;
    }
    
    public T1 getFirst() {
        return this.t1;
    }
    
    public T2 getSecond() {
        return this.t2;
    }

}
