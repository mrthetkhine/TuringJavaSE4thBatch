/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class Scope {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("A is "+a);
        {
            int b = 30;
            System.out.println("a+b "+(a+b));
        }
        //System.out.println("B "+b);
        {
            String b = "Hello";
            System.out.println("B is "+b);
        }
    }
    //a = 10;
}
