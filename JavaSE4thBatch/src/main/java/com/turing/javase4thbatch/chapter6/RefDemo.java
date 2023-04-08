/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class RefDemo {
    public static void main(String[] args) {
        Human obj1 = new Human("Tk",28);
        Human obj2 = obj1;
        
        obj1.name = "Change";
        
        System.out.println("Obj1 name "+obj1.name);
        System.out.println("Obj2 name "+obj2.name);
        
        System.out.println("Obj1== obj2 "+ (obj1 == obj2));
        
        obj2 = new Human("Aung Aung",10);
        obj1.age = 30;
        
        System.out.println("Obj1 age "+obj1.age);
        System.out.println("Obj2 age "+obj2.age);
        
        
        int a = 10;
        int b = a;
        
        a++;
        System.out.println("A "+a);
        System.out.println("B "+b);
    }
}
