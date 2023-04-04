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
public class ConditionControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {10,20,30,40,50};
        
        System.out.println("Enter element to find");
        int element = scanner.nextInt();
        
        boolean found = false;
        int index = 0;
        
        while( !found && index < arr.length)
        {
            if( arr[index]==element)
            {
                found = true;
                System.out.println("Element found at index "+ index);
            }
            index ++;
        }
        
        
    }
}
