/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class OverloadDemo {

    public OverloadDemo() {
        System.out.println("No Argument contructor");
    }
    public OverloadDemo(int a)
    {
         System.out.println("One Argument contructor");
    }
    
    public static void print()
    {
        System.out.println("Print with no parameter");
    }
     public static void print(String str)
    {
        System.out.println("Print with string parameter "+str);
    }
    public static void print(long l)
    {
        System.out.println("Print with long parameter "+l);
    }
    public static void print(int i)
    {
        System.out.println("Print with int parameter "+i);
    }
    
    public static void main(String[] args) {
        /*
        System.out.println("Hello");
        System.out.println(false);
        System.out.println(12);
        */
        print();
        print("Hello");
        print(123);
        print(125L);
        
        byte b = 127;
        print(b);
        
        new OverloadDemo();
        new OverloadDemo(2);
    }
}
