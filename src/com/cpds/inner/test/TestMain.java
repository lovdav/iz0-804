/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.inner.test;

import com.cpds.inner.InnerClass;
import com.cpds.inner.StaticNestedClass;
import com.cpds.inner.StaticNestedClass.Color;

/**
 *
 * @author dml
 */
public class TestMain extends StaticNestedClass.Color
{
    public static void main(String args[]){
        StaticNestedClass ca = new StaticNestedClass();
        StaticNestedClass.Color color = new StaticNestedClass.Color();
        
        Color color2 = new Color();
        int black = StaticNestedClass.Color.black;
        
        InnerClass innerClass = new InnerClass(10, 10, 20);
        innerClass.center = innerClass.new Point(2, 3);
        
        System.out.println(innerClass);
        System.out.println(innerClass.center);
        
    }
}
