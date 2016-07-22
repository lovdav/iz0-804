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
public class Rectangle implements Shape
{
    private int length, height;    
    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
        System.out.println("Rectangle constructor");
    }

    @Override
    public void draw() {
        System.out.println("Rectangle draw()");
    }

    @Override
    public void fillColor() {
        System.out.println("Rectangle fillColor()");
    }    
}
