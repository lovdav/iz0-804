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
public class ShapeMain 
{
    static public void main(String ...args){
        Canvas canvas = new Canvas();
        canvas.add( TypeShape.CIRCLE );
        canvas.add( TypeShape.RECTANGLE );
        canvas.redraw();
    }
}
