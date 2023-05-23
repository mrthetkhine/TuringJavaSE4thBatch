/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        Set<String> another  = new HashSet<String>();
        
        another.add("one");
        another.add("two");
        
        set.add("one");
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("oh");
        System.out.println("Set "+set.size());
        
        Stream<String> data = set.stream();
        data.forEach(System.out::println);
        
        System.out.println("Containall "+set.containsAll(another));
        
        for(String s: set)
        {
            System.out.println("Str "+s);
        }
        Iterator iterator = set.iterator();
        while(iterator.hasNext())
        {
            System.out.println("Item "+iterator.next());
        }
    }
}
