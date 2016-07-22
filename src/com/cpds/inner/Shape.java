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
public class Shape 
{
    private int color;
    
    public Shape() {
        System.out.println("Shape constructor");
    }
    
    public class Color 
    {
        public Color() {
            System.out.println("Color constructor: " + color);
        }
    }
}
