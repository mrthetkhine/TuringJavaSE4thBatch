/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter15;

/**
 *
 * @author macbook
 */
interface Operation
{
    int op(int x, int y);
}
public class FunctionalInterfaceDemo {
    static int add(int x,int y)
    {
        return x+y;
    }
    public static void main(String[] args) {
        Operation oper = (int x, int y)-> x+ y;
        
        System.out.println("Add "+ oper.op(10, 2));
        
        oper = ( a, b)-> a-b; 
        System.out.println("Sub "+ oper.op(10, 2));
        
        oper = FunctionalInterfaceDemo::add;
        oper = (int x, int y)->{
            System.out.println("Addition");
            return x+y;
        };
        System.out.println("Add "+ oper.op(10, 3));
    }
}
