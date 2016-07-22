/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.io;

import java.io.Closeable;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dml
 */
public class TestOutputStream implements Closeable
{
    public static void main(String[] args) 
    {
        try 
        {
            DataOutput dataOutput = new DataOutputStream( new FileOutputStream("") );
            DataOutput dataOutput2 = new ObjectOutputStream( new FileOutputStream("") );
            PrintStream printStream = new PrintStream("");
            
            System.err.println( new Object() );
            AutoCloseable close;
            
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(TestOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
