/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;

/**
 *
 * @author macbook
 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        
        strList.add("Hello");
        strList.add("How");
        strList.add("Banana");
        strList.add("Apple");
        
        Iterator<String> iterator = strList.stream().iterator();
        while( iterator.hasNext())
        {
            System.out.println("Next "+iterator.next());
        }
        
        Spliterator<String> splitIterator = strList.stream().spliterator();
        
        while( splitIterator.tryAdvance(x-> System.out.println(x)));
        
        splitIterator = strList.stream().spliterator();
        Spliterator<String> splitIterator2 = splitIterator.trySplit();
        
        System.out.println("");
        splitIterator.forEachRemaining(x-> System.out.println("X "+x));
        
        if(splitIterator2 != null)
        {
            splitIterator2.forEachRemaining(x-> System.out.println("Another part "+x));
        }
    }
}
