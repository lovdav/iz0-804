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
public class ShapeFactory {
    public static Shape getInstance(TypeShape typeShape) {
        Shape shape = null;        
        if (typeShape == TypeShape.CIRCLE) {
            shape = new Circle(10, 20, 30);
        } else if (typeShape == TypeShape.RECTANGLE) {
            shape = new Rectangle(40, 50);
        }
        return shape;
    }
}
