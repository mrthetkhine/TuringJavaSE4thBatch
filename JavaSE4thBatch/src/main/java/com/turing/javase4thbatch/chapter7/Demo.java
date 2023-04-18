/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class Demo {
    int count;
    static int shared;
    
    static {
        System.out.println("Static block1 executed");
        shared = 1;
        
    }
    static {
        System.out.println("Static block2 executed");
       
    }
    Demo()
    {
        System.out.println("Constructor executed");
        count ++;
        shared ++;
    }
    public static void main(String[] args) {
        
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        
        System.out.println("Obj1.count "+obj1.count);
        System.out.println("Obj2.count "+obj2.count);
        
        System.out.println("Shared "+Demo.shared);
        System.out.println("Shared "+Demo.shared);
    }
 
}
