/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class Factorial {
    static int fact(int num)
    {
        System.out.println("Fact "+num);
        if(num == 0)
        {
            return 1;
        }
        else
        {
            return num * fact(num-1);
        }
    }
    public static void main(String[] args) {
        int result = fact(4);
        System.out.println("Result "+result);
        
        Parent parent = new Parent();
        parent.data = 200;
        
        parent.parentData = 300;
    }
}
