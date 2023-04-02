/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class ForLoopDemo {

    public static void main(String[] args) {
       
        for (int i = 1;i <= 10;i+=2) 
        {
            System.out.println("I " + i);
            //i += 2;
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println("I is " + i);
        }
    }
}
