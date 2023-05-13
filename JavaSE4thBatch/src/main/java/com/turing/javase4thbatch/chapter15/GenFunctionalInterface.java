/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter15;

/**
 *
 * @author macbook
 */
interface SomeFunc<T>
{
    T func(T value);
}
public class GenFunctionalInterface {
    static void doSomething(SomeFunc<Integer> fi)
    {
        System.out.println("Do Something "+ fi.func(20));
    }
    static SomeFunc<Integer> getFunc()
    {
        return (x)->x+2;
    }
    public static void main(String[] args) {
        SomeFunc<String> genStr = (str)-> str.toUpperCase();
        
        System.out.println("GenStr "+genStr.func("hello"));
        
        SomeFunc<Integer> genInt = (x)-> x+1;
        System.out.println("GenInt "+ genInt.func(20));
        
        doSomething(genInt);
        System.out.println("GetFunc "+ getFunc().func(200));
    }
}
