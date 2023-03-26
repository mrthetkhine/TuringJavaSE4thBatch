/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class CharacterDemo {
    public static void main(String[] args) {
        char ch = 'A';
        int a = ch;
        
        ch ++;
        
        System.out.println("Char "+ch);
        System.out.println("A "+a);
        
        ch ='က';
        System.out.println("Char "+ch);
        
        boolean raining = false;
        System.out.println("Rainning "+raining);
        
        //found ++;
        if(raining)
        {
            System.out.println("Take umbrella");
        }
        else
        {
            System.out.println("Take hat");
        }
        
        ch = '\'';
        System.out.println("Ch "+ch);
    }
}
