/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter14;

/**
 *
 * @author macbook
 */
interface MinMax<T extends Comparable<T>>
{
    T min();
    T max();
}
class MyClass<T extends Comparable<T>> implements MinMax<T>
{
    T[] values;
    MyClass(T[] values)
    {
        this.values = values;
    }

    @Override
    public T min() {
        T minEle = this.values[0];
        for (int i = 1; i < this.values.length; i++) {
            if(minEle.compareTo( this.values[i]) > 0)
            {
                minEle = this.values[i];
            }
        }
        return minEle;
    }

    @Override
    public T max() {
        T ele = this.values[0];
        for (int i = 1; i < this.values.length; i++) {
            if(ele.compareTo( this.values[i]) < 0)
            {
                ele = this.values[i];
            }
        }
        return ele;
    }
}
public class GenInterface {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,-5};
        MyClass obj = new MyClass(arr);
        
        System.out.println("Min "+obj.min());
        System.out.println("Max "+obj.max());
    }
}
