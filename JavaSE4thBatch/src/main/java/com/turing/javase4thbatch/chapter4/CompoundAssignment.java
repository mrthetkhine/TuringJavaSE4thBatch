/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class CompoundAssignment {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        b += a + 2;
        //b += a;// b = b + a;
        System.out.println("B "+ b);
    }
}
