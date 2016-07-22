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
public class StaticNestedClass 
{
    public int orange;
    private int brown;
    private static final int white = 10;
    private Color color;
    
    public static class Color 
    {
        int red, green, blue;
        public static final int black = 0;
        
        public Color() {
            this(0, 0, 0);
        }
        public Color(int red, int green, int blue) {
            this.red = red; 
            this.green = green;
            this.blue = blue;
        }        
        @Override
        public String toString() {
            return " red = " + this.red + " green = " + 
                   this.green + " blue = " + this.blue + " white = " + white;
        }
    }  
    
    public static class Figura{
            
    }
    
    @Override
    public String toString() {
        //int s = color.blue;
        return " toString Nested class ";
    }    
    public static void main(String args[]){
        StaticNestedClass nested = new StaticNestedClass();
        System.out.println(nested);        
        
        Color c = new Color();
        System.out.println(c);
        
        StaticNestedClass.Color c1 = new Color();
        System.out.println(c1);
        
        StaticNestedClass.Color c2 = new StaticNestedClass.Color();
        System.out.println(c2);
    }
}
