/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class DifferentZero {
    public static void main(String[] args) {
        int integerZero = 0;
        int negZero = -integerZero;
        System.out.println("Neg Zero "+ negZero);
        
        double dZero = 0;
        double dNegZero = -dZero;
        System.out.println("dNegZero "+dNegZero);
        
        System.out.println("dNegZero==integerZero "+ (dNegZero == integerZero));
        System.out.println("1/dNegZero "+ (1/dNegZero));
        System.out.println("1/dZero "+ (1/dZero));
    }
}
