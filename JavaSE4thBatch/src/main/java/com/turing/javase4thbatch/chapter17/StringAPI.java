/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter17;

/**
 *
 * @author macbook
 */
public class StringAPI {
    public static void main(String[] args) {
        String str1 = "Java programming";
        String str2 = "JavaScript programming";
        
        System.out.println("Region Match "+ str1.regionMatches(0, str2, 0, 4));
        System.out.println("Startwith "+ str1.startsWith("Java"));
        System.out.println("endwith "+ str1.endsWith("programming"));
        
        String str3 = "apple";
        String str4 = "borange";
        
        System.out.println("Compare to "+ str3.compareTo(str4));
        System.out.println("IndexOf "+ str2.indexOf("program"));
        System.out.println("IndexOf "+ str2.indexOf("programmer"));
        
        String str5 = "hello apple good apple and banana and apple";
        System.out.println("LastIndexOf "+ str5.lastIndexOf("apple"));
        System.out.println("Index "+ str5.indexOf("apple",7));
    }
}
