/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author dml
 */
public class PathInfo3 
{
    public static void main(String[] args) 
    {
        Path dirName = Paths.get("D:\\OCPJP7\\programs\\NIO2\\");
        Path resolvedPath = dirName.resolve("Test");
        System.out.println(resolvedPath);
    }    
}
