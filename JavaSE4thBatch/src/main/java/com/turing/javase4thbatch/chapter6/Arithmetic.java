/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class Arithmetic {
    int add(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        Arithmetic arth = new Arithmetic();
        int result = arth.add(1, 2);
        
        System.out.println("Result "+result);
    }
    
}
