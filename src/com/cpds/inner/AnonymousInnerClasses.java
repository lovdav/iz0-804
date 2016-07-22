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
public class AnonymousInnerClasses  {
    public void someMethod(){
        new Object(){};
    }    
    static StaticNestedClass.Color getDesciptiveColor(final StaticNestedClass.Color color)  {
        return new StaticNestedClass.Color() {
            @Override
            public String toString() {
                return "You selected a color with RGB values " + color;
            }
        };
    }    
    public static void main(String []args)  {
        StaticNestedClass.Color descriptiveColor =
        AnonymousInnerClasses.getDesciptiveColor(new StaticNestedClass.Color(0, 0, 0));
        System.out.println(descriptiveColor);
    }
}