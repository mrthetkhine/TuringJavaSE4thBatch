/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        
        System.out.println("A "+a);
        System.out.println("b "+b);
        
        System.out.println("+ "+ (a + b));
        System.out.println(" - "+(a - b));
        System.out.println(" * "+(a * b));
        System.out.println(" / "+(a / b));
        System.out.println(" % "+(a % b));
        
        //System.out.println(" / "+(5 / 0));
        
        System.out.println(" / "+(5 / 0.0));
        System.out.println(" / "+(5 / 2.0));
        
        double invalid = 0/.0;
        System.out.println(" / "+invalid);
        System.out.println(" / "+ (invalid==invalid));
        
        System.out.println("NaN+something "+(invalid+1));
        System.out.println("isNan "+ Double.isNaN(invalid));
    }
}
