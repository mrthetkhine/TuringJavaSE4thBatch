/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter19;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class SortSetDemo {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<String>();
        
        set.add("one");
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("oh");
        
        Stream<String> data = set.stream();
        data.forEach(System.out::println);
        
        SortedSet<String> subset = set.subSet("four", "three");
        System.out.println("Subset----");
        
        Stream<String> subSetData = subset.stream();
        subSetData.forEach(System.out::println);
        
        SortedSet<String> tailSet = set.tailSet("three");
        System.out.println("tailset---");
        
        Stream<String> tailSetData = tailSet.stream();
        tailSetData.forEach(System.out::println);
        
        System.out.println("HeadSet------- ");
        set.headSet("one").stream().forEach(System.out::println);
    }
}
