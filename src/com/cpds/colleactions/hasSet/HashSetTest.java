/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpds.colleactions.hasSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * @author dml
 */
public class HashSetTest 
{
    public static void main(String args[]){
        String tongueTwister = "I feel, a feel, a funny feel, a funny feel I feel,if you feel the feel I feel, I feel the feel you feel";
        Set<String> words = new HashSet<>();

        for(String word : tongueTwister.split("\\W+"))
        {
            System.out.println( word );
            words.add(word);
        }
        System.out.println( words );
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            System.out.println( iterator.next() );
        }
        
        LinkedList linkedList = null;
    }
}
