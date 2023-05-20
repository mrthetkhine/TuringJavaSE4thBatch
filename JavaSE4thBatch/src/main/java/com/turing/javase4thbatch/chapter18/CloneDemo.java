/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter18;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class Data implements Cloneable
{
    int data ;
    Data(int a)
    {
        this.data = a;
    }
    Data getCopy()
    {
        try {
            return (Data)this.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
public class CloneDemo {
    public static void main(String[] args) {
        Data data = new Data(10);
        Data data2 = data.getCopy();
        
        System.out.println("Data "+data.data);
        System.out.println("Data2 "+data2.data);
        
        Class<?> clazz = data.getClass();
        System.out.println("ClassName "+ clazz.getCanonicalName());
        System.out.println("ClassLoader "+ clazz.getClassLoader().getName());
    }
}
