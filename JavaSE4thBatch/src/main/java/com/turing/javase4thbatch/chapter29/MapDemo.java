/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class MapDemo {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        
        strList.add("Hello");
        strList.add("How");
        strList.add("Banana");
        strList.add("Apple");
        
        Stream<String> upperCaseList  = strList.stream().map(x->x.toUpperCase());
        
        upperCaseList.forEach(System.out::println);
        
        Stream<Integer> lengthList  = strList.stream().map(x->x.length());
        
        lengthList.forEach(System.out::println);
        
        List<Integer> list =strList
                                .stream()
                                .map(x-> x.length())
                                .collect(Collectors.toList());
        for(Integer i : list)
        {
            System.out.println("I "+i);
        }
    }
}
