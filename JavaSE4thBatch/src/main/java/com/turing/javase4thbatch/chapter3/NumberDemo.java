/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class NumberDemo {
    public static void main(String[] args) {
        byte data = -128;
        short another = 127;
        
        another ++;
        System.out.println("Another "+another);
        
        float price = 1.2F;
        
        another = 0xFF;
        System.out.println("Another "+another);
        
        another = 020;
        System.out.println("Another "+another);
        
        another = 0b11;
        System.out.println("Another "+another);
        
        int x = 123_456_789;
        System.out.println("X "+x);
        
        double d = .3E2;
        System.out.println("D is "+d);
    }
}
