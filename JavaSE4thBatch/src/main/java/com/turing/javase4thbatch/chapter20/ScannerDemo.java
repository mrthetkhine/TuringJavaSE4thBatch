/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter20;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        
        System.out.println("Name "+name + " age "+age);
    }
}
