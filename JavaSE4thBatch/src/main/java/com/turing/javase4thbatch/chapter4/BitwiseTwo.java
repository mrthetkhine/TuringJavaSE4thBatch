/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class BitwiseTwo {
    public static void main(String[] args) {
        int a = 9;
        int b = 2;
        System.out.println("A in binary "+ Integer.toBinaryString(a));
        System.out.println("B in binary "+ Integer.toBinaryString(b));
        System.out.println("A>>1 in binary "+ Integer.toBinaryString(a>>1));
        System.out.println("A>>1 in decimal "+ (a>>2));
        System.out.println("A<<1 in decimal "+ (a<<1));
    }
}
