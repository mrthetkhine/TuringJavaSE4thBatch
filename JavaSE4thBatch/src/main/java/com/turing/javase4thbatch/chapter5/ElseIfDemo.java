/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter5;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class ElseIfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter myanmar mark");
        int myan = scanner.nextInt();
        
        if(myan >=80)
        {
            System.out.println("Distinction");
        }
        else if(myan >=40)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
        
    }
}
