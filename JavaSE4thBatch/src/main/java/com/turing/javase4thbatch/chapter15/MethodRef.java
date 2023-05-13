/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter15;

/**
 *
 * @author macbook
 */
interface Something
{
    void doSomething();
    //void doAntoher();
}
public class MethodRef {
    void something()
    {
        System.out.println("Instance method do something");
    }
    static void hello()
    {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Something something = MethodRef::hello;
        something.doSomething();
        
        MethodRef obj = new MethodRef();
        something = obj::something;
        something.doSomething();
    }
}
