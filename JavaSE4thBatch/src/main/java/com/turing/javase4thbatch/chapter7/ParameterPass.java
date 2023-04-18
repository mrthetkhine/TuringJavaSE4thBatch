/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter7;

/**
 *
 * @author macbook
 */
class Data
{
    int data;
    Data(int data)
    {
        this.data = data;
    }
}
public class ParameterPass {
    void inc(int a)
    {
        System.out.println("A is "+a);
        a ++;
    }
    void change(Data obj)
    {
        System.out.println("Change data "+ obj.data);
        obj.data ++;
    }
    void change2(Data obj)
    {
        System.out.println("Change2 data "+ obj.data);
        obj = new Data(10);
    }
    public static void main(String[] args) {
        ParameterPass par = new ParameterPass();
        
        int data = 10;
        par.inc(data);
        
        System.out.println("Data "+data);
        
        Data obj2 = new Data(20);
        par.change(obj2);
        
        System.out.println("Obj2.data "+obj2.data);
        
        par.change2(obj2);
        System.out.println("Obj2.data "+obj2.data);
    }
}
