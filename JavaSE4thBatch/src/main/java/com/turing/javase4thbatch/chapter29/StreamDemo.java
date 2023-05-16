/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        
        list.add(10);
        list.add(2);
        list.add(15);
        list.add(28);
        list.add(-5);
        list.add(4);
        
        
        Stream<Integer> stream = list.stream();
        
        Optional<Integer> min = stream.min(Integer::compare);
        
        if(min.isPresent())
        {
            System.out.println("Min "+min.get());
        }
        stream = list.stream();
        Optional<Integer> max = stream.max(Integer::compare);
        
        if(max.isPresent())
        {
            System.out.println("Max "+max.get());
        }
        
        stream = list.stream();//.sorted();
        stream.forEach((x)-> System.out.println("X is "+x));
        System.out.println("====");
        stream = list.stream().map((x)-> x *2);
        stream.forEach((x)-> System.out.println("X is "+x));
        
        System.out.println("");
        
        stream = list.stream().filter((x)-> x % 2 ==0)
                              .map((x)-> x * 2 );
        stream.forEach((x)-> System.out.println("X is "+x));
    }
}
