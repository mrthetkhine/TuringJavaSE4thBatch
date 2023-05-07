/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter12;

/**
 *
 * @author macbook
 */
class Parent
{
    void method()
    {
        System.out.println("Parent method");
    }
}
class Child extends Parent
{
    @Override
    void method()
    {
       System.out.println("Child method");
    }
}
public class AnnotationDemo {
    public static void main(String[] args) {
        Parent p = new Child();
        p.method();
    }
    
}
