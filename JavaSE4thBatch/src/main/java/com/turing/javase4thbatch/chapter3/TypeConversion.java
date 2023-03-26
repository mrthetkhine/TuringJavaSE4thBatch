/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class TypeConversion {
    public static void main(String[] args) {
        short s = 128;
        int a = s;
        
        System.out.println("A is "+a);
        
        char ch = 'A';
        a = ch;
        System.out.println("A is "+a);
        
        float price = 3.2f;
        a = (int)price;
        
        System.out.println("A is "+a);
        
        //a = (int)false;
    }
}
