/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter14;

/**
 *
 * @author macbook
 */
class Gen<T>
{
    T obj;
    Gen(T obj)
    {
        this.obj = obj;
    }
    T get()
    {
        return this.obj;
    }
}
class Gen2<T> extends Gen<T>
{
    Gen2(T obj)
    {
        super(obj);
    }
}
public class GenricInstanceOfDemo {
    public static void main(String[] args) {
        Gen<Integer> gen = new Gen(20);
        Gen2<Integer> gen2 = new Gen2(10);
        
        
        Gen2<String> gen2Str = new Gen2("Hello");
        
        System.out.println("gen2 instanceof Gen2 "+ (gen2 instanceof Gen2<?>));
        System.out.println("gen2 instanceof Gen "+ (gen2 instanceof Gen));
        System.out.println("str instanceof Gen2 "+ (gen2Str instanceof Gen2));
        System.out.println("str instanceof Gen "+ (gen2Str instanceof Gen));
        
        Gen<Float> genFloat = new Gen(20.2f);
        gen = (Gen<Integer>)gen2;
        
        //genFloat = (Gen<Integer>) gen2;
    }
}
