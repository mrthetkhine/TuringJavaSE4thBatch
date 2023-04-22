/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter8;

/**
 *
 * @author macbook
 */
class Parent
{
    private int a;
    protected int k;
    void method1()
    {
        System.out.println("Method 1");
    }
    void method()
    {
        System.out.println("Parent method");
    }
}
class Derived extends Parent
{
    int b;
    void method2()
    {
        System.out.println("Method 2 "+k);
    }
    void method()
    {
        System.out.println("Derived method");
    }
}
class Third extends Derived
{
    int c;
    void method3()
    {
        System.out.println("Method 3 "+k);
    }
    void method()
    {
        super.method();
        System.out.println("Third method");
    }
}
public class BasedDerivedDemo {
    public static void main(String[] args) {
        Third d = new Third();
//        d.a = 100;
        d.b = 200;
        d.c = 400;
        
        d.method1();
        d.method2();
        d.method();
    }
}
