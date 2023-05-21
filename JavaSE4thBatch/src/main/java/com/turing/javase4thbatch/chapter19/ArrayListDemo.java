/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter19;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> another = new ArrayList<>();
        another.add("two");
        another.add("three");
        
        List<String> data = new ArrayList<>();
        
        data.add("One");
        data.addAll(another);
        data.add("One");
        
        data.stream().forEach(System.out::println);
        
        System.out.println("Data "+ data.contains("One"));
        System.out.println("Data "+ data.contains(new String("One")));
        
        System.out.println("Containall "+data.containsAll(another));
        System.out.println("HashCode "+data.hashCode());
        System.out.println("IsEmpty "+data.isEmpty());
        
        data.remove("One");
        System.out.println("After remove");
        data.stream().forEach(System.out::println);
        
        /*
        System.out.println("RemoveAll");
        data.removeAll(another);
        data.stream().forEach(System.out::println);
        */
        /*
        System.out.println("RemoveIf");
        data.removeIf((x)->x.length()==3);
        data.stream().forEach(System.out::println);
        */
        /*
        System.out.println("Retain all");
        data.retainAll(another);
        data.stream().forEach(System.out::println);
        */
        data.add(2,"New item");
        System.out.println("Size "+data.size());
        System.out.println("Get "+data.get(2));
        
        System.out.println("After insert");
        data.stream().forEach(System.out::println);
        
        System.out.println("IndexOf one "+data.indexOf("One"));
        data.remove(1);
        
        System.out.println("After remove ----");
        data.stream().forEach(System.out::println);
        
        data.set(0,"Two");
        System.out.println("After set ----");
        data.stream().forEach(System.out::println);
        
        data.sort((a,b)->a.compareTo(b));
        System.out.println("After sort");
        data.stream().forEach(System.out::println);
        
        List<String> subList = data.subList(0, 2);
        System.out.println("SubList ");
        subList.stream().forEach(System.out::println);
    }
}
