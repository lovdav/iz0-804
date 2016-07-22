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
public class PathInfo1 
{
    public static void main(String[] args) 
    {
        String file = "/home/dml/Imágenes/java/nio2_1.png";
        Path path = Paths.get(file);
        
        System.out.printf("Nombre: %s%n", path.getFileName() );
        System.out.printf("Root: %s%n", path.getRoot() );
        System.out.printf("Parent: %s%n", path.getParent() );
        
        for (Path path1 : path) {
            System.out.println("Elemento: " +  path1 );
        }
        
        for (int i =0; i<path.getNameCount(); i++){
            Path pathName = path.getName(i);
            System.out.println("Name: " +  pathName );
        }
    }
}
