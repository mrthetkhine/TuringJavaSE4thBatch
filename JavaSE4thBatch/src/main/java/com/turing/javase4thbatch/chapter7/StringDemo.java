/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello";
        //str = null;
        System.out.println("str instanceof Object "+ (str instanceof Object));
        System.out.println("str instanceof String "+ (str instanceof String));
        
        String str2 = "Hello";
        System.out.println("str== str2 "+ (str == str2));
        System.out.println("str.equals(str2) "+ (str.equals(str2)));
        
        boolean same = "Hello".equals(str);
        System.out.println("Same "+same);
        
        String str3 = new String("Hello");
        System.out.println("str== str3 "+ (str == str3));
        
        String str4 = "Hel"+"lo";
        System.out.println("str== str4 "+ (str == str4));
        
        String str5 = "Hel"+ new String("lo");
        System.out.println("str== str5 "+ (str == str5));
    }
}
