/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.nio2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dml
 */
public class PathCompare 
{
    public static void main(String[] args) 
    {
        Path path = Paths.get("Test.txt");
        Path pathReal = Paths.get("/home/dml/NetBeansProjects/iz0-804/Test.txt");
        
        File file = path.toFile();
        Files files = null;
        if(file.isFile()){
            System.out.println("Finaliza");
        }
        try {
            path.toRealPath(LinkOption.NOFOLLOW_LINKS);
        } catch (IOException ex) {
            Logger.getLogger(PathCompare.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("path.toAbsolutePath(): " + path.toAbsolutePath());
        System.out.println("path.equals(pathReal): "+ path.equals(pathReal));
        System.out.println("(path.compareTo(pathReal) == 0): "+ (path.compareTo(pathReal) == 0)  );
        System.out.println("pathReal.equals(path.toAbsolutePath()): " + pathReal.equals(path.toAbsolutePath()));
        System.out.println("(path.toAbsolutePath().equals(pathReal.toAbsolutePath())): " + (path.toAbsolutePath().equals(pathReal.toAbsolutePath())));
        System.out.println("pathReal.toAbsolutePath().equals(path.toAbsolutePath()): " + pathReal.toAbsolutePath().equals(path.toAbsolutePath()));
    }
}
