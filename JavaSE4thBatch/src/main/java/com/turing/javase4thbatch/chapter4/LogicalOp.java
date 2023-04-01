/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter4;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class LogicalOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter age");
        int age = scanner.nextInt();
        
        System.out.println("Age "+age);
        
        boolean validAge = age > 0 & age < 120;
        System.out.println("Age valid? "+validAge);
        
        boolean flag = true;
        System.out.println("!Flag "+(!flag));
    }
}
