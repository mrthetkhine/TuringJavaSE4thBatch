/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter18;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
class Human implements Comparable
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
        return "[Human name = "+name+" age  ="+age+"]";
    }

    @Override
    public int compareTo(Object o) {
        Human another = (Human)o;
        return this.age - another.age;
    }
}
public class SortingDemo {
    public static void main(String[] args) {
        
        ArrayList<Human> list = new ArrayList<Human>();
        
        list.add(new Human("Aung Aung",20));
        list.add(new Human("Mya Aung",18));
        list.add(new Human("Moe Aung",25));
        
        list.sort((a,b)-> a.compareTo(b));
        
        for(Human h: list)
        {
            System.out.println(""+h);
        }
    }
}
