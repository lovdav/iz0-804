/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.string;

import java.text.DecimalFormat;
import java.text.Format;

/**
 *
 * @author dml
 */
public class MaxValues 
{
    private static DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
    public static void main(String[] args) 
    {
        
        System.out.println("double\t" + decimalFormat.format(Double.MIN_VALUE) + "\t" + decimalFormat.format(Double.MAX_VALUE));
        Double d = 9123456789012345678.78;
        System.out.println(decimalFormat.format(d));
        System.out.println(d.toString());
    }
}
