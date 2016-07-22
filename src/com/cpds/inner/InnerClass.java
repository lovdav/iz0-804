/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.inner;

import java.io.Serializable;

/**
 *
 * @author dml
 */
public class InnerClass
{
    public Point center;
    private int radius;
    public int otro;

    public class Point implements Serializable
    {
        private int xPos;
        private int yPos;
        
        public Point(int x, int y) {
            xPos = x;
            yPos = y;
        }
        @Override
        public String toString() {
            return "(" + xPos + "," + yPos + ")";
        }
    }
  
    public InnerClass(int x, int y, int r) {
        center = this.new Point(x,y);
        radius = r;
    }
    @Override
    public String toString() {
        return "mid point = " + center + " and radius = " + radius;
    }
    
    public static void main(String[] s) {
        InnerClass innerClass = new InnerClass(10, 10, 20);
        innerClass.center = innerClass.new Point(2, 3);
        
        System.out.println(innerClass);
        System.out.println(innerClass.center);
    }
}
