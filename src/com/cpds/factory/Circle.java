/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.factory;

/**
 *
 * @author dml
 */
public class Circle implements Shape
{
    private int xPos, yPos;
    private int radius;
    
    public Circle(int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
        System.out.println("Circle constructor");
    }

    @Override
    public void draw() {
        System.out.println("Circle draw()");
    }

    @Override
    public void fillColor() {
        System.out.println("Circle fillColor()");

    }
    
}
