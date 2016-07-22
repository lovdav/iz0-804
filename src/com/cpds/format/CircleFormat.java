/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.format;

/**
 *
 * @author dml
 */
public class CircleFormat 
{
    private int x, y, radius;
    
    public CircleFormat(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    void area() {
        double tempArea = Math.PI * radius * radius;
        System.out.println("Cirle area using default formatting with println: " + tempArea);
        System.out.printf("Circle area using format specifier with printf: %.2f", tempArea);
    }
    
    public static void main(String[] str) 
    {
        CircleFormat circle = new CircleFormat(10,10,5);
        circle.area();
    }

}
