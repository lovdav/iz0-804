/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.factory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author dml
 */
public class Canvas 
{
    private List<Shape> shapes = null;
    
    public Canvas(){
        super();
        this.shapes = new ArrayList<>();
    }
    
    public void add(TypeShape typeShape) {
        Shape shape = ShapeFactory.getInstance(typeShape);
        this.shapes.add(shape);
    }
    
    public void redraw() {
        Iterator<Shape> iterator = this.shapes.iterator();
        if (iterator.hasNext()) {
            iterator.next().draw();
        }
    }
}
