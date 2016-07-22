/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dml
 */
public class TestObjectStream 
{
    public static void main(String[] args) 
    {
        String file = "/home/dml/Documentos/java7/ejercicios/object.data";
        escribirObjectOutputStream(file);
        leerObjectOutputStream(file);
    }
    
    public static void escribirObjectOutputStream(String file)  {
        try  {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
            Map<String,Integer> nombres = new Hashtable<>();
            nombres.put("David", 30);
            nombres.put("Israel", 28);
            nombres.put("Ariana", 15);
            nombres.put("Amely", 11);
            
            outputStream.writeObject(nombres);
            outputStream.flush();
            outputStream.close();
            
        } catch (IOException ex) {
            Logger.getLogger(TestObjectStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   

    public static void leerObjectOutputStream(String file) 
    {
        try  {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file) );
            Object object = objectInputStream.readObject();
            
            if (object != null && object instanceof Map ) {
                Map<String,Integer> map = (Map<String,Integer>) object;
                for (Map.Entry<String,Integer> entry : map.entrySet() ) {
                    System.out.printf("nombre: %-10s \t %d años %n", entry.getKey(), entry.getValue());
                }
            }            
        } catch (IOException ex) 
        {
            Logger.getLogger(TestObjectStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestObjectStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
