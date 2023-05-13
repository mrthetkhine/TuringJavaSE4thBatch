/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter14;

/**
 *
 * @author macbook
 */
class Parent<T>
{
    T obj;
    Parent(T obj)
    {
        this.obj = obj;
    }
    T get()
    {
        return this.obj;
    }
}
class Child<T> extends Parent<T>
{
    Child(T obj)
    {
        super(obj);
    }
    T get()
    {
        System.out.println("get override");
        return obj;
    }
}
class ChildTwo<T,V> extends Parent<T>
{
    V value;
    ChildTwo(T obj, V value)
    {
        super(obj);
        this.value = value;
    }
    V getValue()
    {
        return this.value;
    }
}
public class GeneircSuperDemo {
    public static void main(String[] args) {
        Child<String> data = new Child<>("Hello");
        System.out.println("data "+ data.get());
        
        var two = new ChildTwo<String,Integer>("Hello",100);
        System.out.println("Data "+two.get() + " Str "+ two.getValue());
    }
}
