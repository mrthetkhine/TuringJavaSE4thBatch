/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter12;

/**
 *
 * @author macbook
 */
public class WrapperDemo {
    public static void main(String[] args) {
        Integer i = 13;//Boxing
        int k = i;//Unboxing
        
        System.out.println("I "+i);
        System.out.println("I instanceof Object "+ (i instanceof Object));
        
        i = new Integer(13);
        i = Integer.valueOf("13");
        
        System.out.println("I value "+ i.intValue());
    }
}
