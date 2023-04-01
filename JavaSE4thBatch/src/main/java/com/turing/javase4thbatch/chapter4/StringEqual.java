/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class StringEqual {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        System.out.println("str==str2 "+ (str == str2));
        System.out.println("str3==str2 "+ (str3 == str2));
        System.out.println("equals "+ str3.equals(str2));
    }
}
