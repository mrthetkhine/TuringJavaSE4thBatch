/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Random random = new Random();
        int number = random.nextInt(10)+1;
        
        boolean correct = false;
        int attempt = 1;
        do
        {
           System.out.println("Enter your guess attempt "+attempt);
           int guess = scanner.nextInt();
           
           if( guess == number)
           {
               System.out.println("Correct at "+attempt);
               correct = true;
           }
           else if (guess> number)
           {
               System.out.println("Too large");
           }
           else
           {
               System.out.println("Too small");
           }
           attempt++;
        }while(!correct);
    }
}
