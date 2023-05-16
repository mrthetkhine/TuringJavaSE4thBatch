/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter29;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author macbook
 */
public class ReduceDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        
        list.add(10);
        list.add(2);
        list.add(15);
        list.add(28);
        list.add(-5);
        list.add(4);
        
        Integer total = list.stream().reduce(0,(a,b)-> {
            System.out.println("A "+a + " B "+b);
            return a+b;
        });
        System.out.println("Total "+ total);
        Integer min = list.parallelStream().reduce(0,(a,b)-> a>b?b:a);
        System.out.println("Min "+ min);
    }
}
