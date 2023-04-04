/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class Human {
    String name;
    int age;
    
    Human(String name,int age)
    {
        System.out.println("Human contructor");
        this.name = name;
        this.age = age;
    }
    public void work()
    {
        System.out.println("Name "+this.name + " Age "+this.age + " work");
    }
    public static void main(String[] args) {
        Human obj1 = new Human("Tk",38);
        Human obj2 = new Human("Aung Aung",35);
        
        obj1.work();
        obj2.work();
    }
}
