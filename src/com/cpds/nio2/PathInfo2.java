/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.nio2;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dml
 */
public class PathInfo2 
{
    public static void main(String[] args) 
    {
        Path testFilePath = Paths.get("./Test");
        System.out.println("The file name is: " + testFilePath.getFileName());
        System.out.println("It's URI is: " + testFilePath.toUri());
        System.out.println("It's absolute path is: " + testFilePath.toAbsolutePath());
        System.out.println("It's normalized path is: " + testFilePath.normalize());

        // get another path object with normalized relative path
        Path testPathNormalized = Paths.get(testFilePath.normalize().toString());
        System.out.println("It's normalized absolute path is: " +
        testPathNormalized.toAbsolutePath());
        try 
        {
            System.out.println("It's normalized real path is: " +
                    testFilePath.toRealPath (LinkOption.NOFOLLOW_LINKS));
        } catch (IOException ex) {
            Logger.getLogger(PathInfo2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
