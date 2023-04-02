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
public class IfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter myanmar mark");
        int myan = scanner.nextInt();
        
        System.out.println("Enter english");
        int eng = scanner.nextInt();
        
        System.out.println("Enter Math");
        int math = scanner.nextInt();
        
        if( myan >= 40)
        {
            System.out.println("Myanmar pass");
            if(eng >=40 )
            {
                System.out.println("Eng pass");
                if(math >= 40)
                {
                     System.out.println("Pass");
                }
                else
                {
                    System.out.println("Fail");
                }
               
            }
            else
            {
                System.out.println("Fail");
            }
            
        }
        else
        {
            System.out.println("Fail");
        }
        System.out.println("Afte if");
        
        boolean raining = true;
        
        if(raining)
        {
            System.out.println("Take umbrella");
        }
    }
}
