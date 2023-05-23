/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author macbook
 */
class Human implements Comparable<Human>
{
    String name;
    int age;
    Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String toString()
    {
        return "{Human name="+this.name+",age="+this.age+"}";
    }

  
    @Override
    public int compareTo(Human o) {
        return this.age - o.age;
    }
}
public class SortDemo {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<Human>();
        
        list.add(new Human("One",30));
        list.add(new Human("Two",13));
        list.add(new Human("Three",20));
        
        //list.sort((a,b)-> a.age - b.age);
        //Comparator<Integer> comparator = Collections.reverseOrder();
        Collections.sort(list, (a,b)->a.age - b.age);
        
        list.stream().forEach(System.out::println);
        
        System.out.println("Shuffle");
        Collections.shuffle(list);
        list.stream().forEach(System.out::println);
        
        System.out.println("Max "+ Collections.max(list));
        System.out.println("Min "+ Collections.min(list));
    }
}
