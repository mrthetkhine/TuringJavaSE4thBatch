/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author macbook
 */
public class MapDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        
        for (int i = 0; i < 100000; i++) {
            list.add("Item "+i);
        }
        double start = System.currentTimeMillis();
        
        int index = list.indexOf("Item "+99999);
        double end = System.currentTimeMillis();
        double time = end - start;
        System.out.println("Time "+time + "Index "+index);
        
        Map<String,Integer> map = new HashMap<String,Integer>(); 
         for (int i = 0; i < 100000; i++) {
            map.put("Item "+i, i);
        }
        
        start = System.currentTimeMillis();
        index = map.get("Item "+99999);
        end = System.currentTimeMillis();
        time = end - start;
        System.out.println("Time "+time + "Index "+index);
    }
}
