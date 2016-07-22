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
public class LocalInnerClass 
{
    static StaticNestedClass.Color getColor(final StaticNestedClass.Color color)
    {
        final class DescribeColor extends StaticNestedClass.Color
        {
            @Override
            public String toString(){
                return "El color es: " + color;
            }
        }
        return (new DescribeColor());
    }
    
    static public void main(String args[]) {
        StaticNestedClass.Color color = getColor( new StaticNestedClass.Color(10, 3, 20) );
        System.out.println( color );
    }
    
    public void anidada()
    {
        class LocalNested {
            
        }
    }
}
