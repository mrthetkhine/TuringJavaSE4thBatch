/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class PrecedenceAssociativity {
    
    static int getTen()
    {
        System.out.println("Get 10");
        return 10;
    }
    static int getFive()
    {
        System.out.println("Get 5");
        return 5;
    }
    public static void main(String[] args) {
        
        double result = 10 + 20 / ( 2 * 4 );
        System.out.println("Result "+result);
        
        result = getTen() + getFive() * 3;
        System.out.println("Result "+result);
        
        double k = result = 30;
        System.out.println("K "+ k);
    }
}
