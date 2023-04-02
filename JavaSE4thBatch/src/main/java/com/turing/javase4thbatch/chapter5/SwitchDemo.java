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
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter day in number");
        byte day = scanner.nextByte();
       
        /*
        if(day==1)
        {
            System.out.println("Sunday");
        }
        else if(day==2)
        {
             System.out.println("Monday");
        }
        else if(day==3)
        {
             System.out.println("Tuesday");
        }
        */
        switch(day)
        {
            case 1:
            case 7:
                System.out.println("Holiday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3: 
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other");
        }
    }
}
