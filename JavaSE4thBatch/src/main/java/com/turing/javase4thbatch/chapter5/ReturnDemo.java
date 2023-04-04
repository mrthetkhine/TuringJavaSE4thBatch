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
public class ReturnDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][] = {
            {10,20,30,40,50},
            
            {60,70,80,90}
        };
        
        System.out.println("Enter element to find");
        int element = scanner.nextInt();
        
        boolean found = false;
        int index = 0;
        
        outer:for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(element == arr[i][j])
                {
                    found = true;
                    index = i;
                    System.out.println("Found at index "+i + ", "+j);
                    //break outer;
                    return;
                }
                System.out.println("Colum "+j);
            }
            
            System.out.println("Row "+i);
        }
        if(found)
        {
            System.out.println("Found at index "+index);
        }
    }
}
