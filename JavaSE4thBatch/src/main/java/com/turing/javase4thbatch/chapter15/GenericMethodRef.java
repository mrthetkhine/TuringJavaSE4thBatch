/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter15;

/**
 *
 * @author macbook
 */
interface MyFunc<T>
{
    T transform(T value);
}

public class GenericMethodRef {
    
    static String upper(String msg)
    {
        return msg.toUpperCase();
    }
    static Integer inc(Integer x)
    {
        return x+1;
    }
    String appendHi(String message)
    {
        return "Hi "+ message;
    }
    public static void main(String[] args) {
        MyFunc<Integer> intTransform = GenericMethodRef::inc;
        
        System.out.println("IntTrnasform "+intTransform.transform(20));
        
        MyFunc<String> strTransform = GenericMethodRef::upper;
        System.out.println("String "+strTransform.transform("Hello"));
        
        GenericMethodRef obj = new GenericMethodRef();
        strTransform = obj::appendHi;
        System.out.println("String "+strTransform.transform("Hello"));
    }
}
