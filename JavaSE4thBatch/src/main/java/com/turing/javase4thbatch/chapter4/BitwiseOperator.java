/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        System.out.println("A in binary "+ Integer.toBinaryString(a));
        System.out.println("B in binary "+ Integer.toBinaryString(b));
        System.out.println("A & B in binary "+ Integer.toBinaryString(a & b));
        System.out.println("A | B in binary "+ Integer.toBinaryString(a | b));
        System.out.println("A ^ B in binary "+ Integer.toBinaryString(a ^ b));
        System.out.println("~ B in binary "+ Integer.toBinaryString(~ b));
        System.out.println(" B>>1 in binary "+ Integer.toBinaryString(b>>1));
        
        int modifier = 5;
        int publicFlag = 1;
        int staticFlag = 4;
        System.out.println("modifier in binary "+ Integer.toBinaryString(modifier));
        
        boolean isPublic = (modifier & publicFlag) == publicFlag ;
        System.out.println("isPublic "+isPublic);
        
        boolean isStatic = (modifier & staticFlag) == staticFlag;
        System.out.println("IsStatic "+isStatic);
    }
}
