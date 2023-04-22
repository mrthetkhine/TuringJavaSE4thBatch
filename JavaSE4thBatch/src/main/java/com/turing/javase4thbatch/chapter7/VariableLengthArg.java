/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class VariableLengthArg {
    
    static int sum(String message,int ...data)
    {
        System.out.println("Message "+message);
        int result = 0;
        for(int i : data)
        {
            result += i;
        }
        return result;
    }
    public static void main(String[] args) {
        int result = sum("Sum all digit",1,2,3,4,5,6);
        result = sum("Empty");
        System.out.println("Result "+result);
    }
}
