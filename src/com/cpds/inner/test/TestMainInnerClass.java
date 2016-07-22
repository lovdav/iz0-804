/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.inner.test;

import com.cpds.inner.InnerClass;

/**
 *
 * @author dml
 */
public class TestMainInnerClass extends InnerClass
{

    public TestMainInnerClass(int x, int y, int r) {
        super(x, y, r);
    }
    
    public class Other extends InnerClass.Point
    {

        public Other(int x, int y) {
            super(x, y);
        }
        
    }
    
}
