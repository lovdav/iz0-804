/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.enums;

/**
 *
 * @author dml
 */
public enum PrinterType 
{
    
    // #1
    DOTMATRIX(5), INKJET(10), LASER(50);
    // #2
    
    private int pagePrintCapacity;
    private PrinterType(int pagePrintCapacity) {
        this.pagePrintCapacity = pagePrintCapacity;
    }
 
    public int getPrintPageCapacity() {
        return pagePrintCapacity;
    }

    
}
