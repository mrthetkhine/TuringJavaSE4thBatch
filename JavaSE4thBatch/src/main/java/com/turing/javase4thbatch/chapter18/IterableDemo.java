/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter18;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class IterableDemo implements Iterable<String>{
    
    List<String> data ;
    IterableDemo(List<String> data)
    {
        this.data = data;
    }
    @Override
    public Iterator iterator() {
        return this.data.iterator();
    }
    public static void main(String[] args) {
        List<String> data ;
        data = new ArrayList<String>();
        
        data.add("one");
        data.add("Two");
        data.add("Three");
        
        IterableDemo demo = new IterableDemo(data);
        
        for(String item : demo)
        {
            System.out.println("Item " +item);
        }
        
    }

    
}
