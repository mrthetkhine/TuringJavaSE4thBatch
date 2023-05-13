/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter14;

/**
 *
 * @author macbook
 */
class NonGenericSuper
{
    String data;
    
    NonGenericSuper(String data)
    {
        this.data = data;
    }
    String getData()
    {
        return this.data;
    }
}
class GenericChild<T> extends NonGenericSuper
{
    T value;
    GenericChild(T value, String data)
    {
        super(data);
        this.value = value;
    }
    T getValue()
    {
        return this.value;
    }
}
public class NonGenericSuperDemo {
    public static void main(String[] args) {
        GenericChild<Integer> obj = new GenericChild(100,"key");
        System.out.println("Obj "+obj.getValue() + " data "+obj.getData());
    }
}
