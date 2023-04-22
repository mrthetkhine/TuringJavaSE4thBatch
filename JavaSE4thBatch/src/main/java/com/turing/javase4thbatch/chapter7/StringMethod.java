/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class StringMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        
        System.out.println("Length "+ str.length());
        System.out.println("CharAt "+ str.charAt(0));
        System.out.println("CharAt 10 "+ str.charAt(10));
        
        System.out.println("Str.toUpperCase "+ str.toUpperCase());
        System.out.println("Str "+str);
        
        System.out.println("Str.lowerCase "+ str.toLowerCase());
        System.out.println("Str.substring "+ str.substring(5));
        
        System.out.println("Str.substring(0,3) "+ str.substring(0, 3));
        System.out.println("Str.concat "+ str.concat("Hi"));
        
        System.out.println("Str.repeat "+ str.repeat(4));
        System.out.println("Str.replaceAll "+ str.replaceAll("Hello", "How are you"));
        
        String[]arr = str.split(" ");
        for(String item : arr)
        {
            System.out.println("Item "+item);
        }
    }
    
}
