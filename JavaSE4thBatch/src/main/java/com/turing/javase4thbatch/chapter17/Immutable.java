/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter17;

import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class Immutable {
    public static void main(String[] args) {
        String str = "Hello";
        String str2= str.toUpperCase();
        
        String str3 = "java programming";
        System.out.println("Str "+ str);
        System.out.println("Str2 "+ str2);
        System.out.println("str3.substrnig "+ str3.substring(2,6));
        
        String str4 = str.replace('l', 'k');
        System.out.println("Str4 "+ str4);
        
        String str5 = " hello \n\r ";
        System.out.println("Trim "+ str5.trim()+" Length "+str5.trim().length());
        System.out.println("Trim "+ str5.strip()+" Length "+str5.strip().length());
        System.out.println("Leading Strip "+ str5.stripLeading());
        System.out.println("Leading Strip "+ str5.stripTrailing());
        
        System.out.println("ValueOf "+ String.valueOf(32));
        
        System.out.println("Join "+ String.join(" ;","java","javascript"));
        
        String str6 = "One\r\nTwo\r\nThree";
        
        Stream<String> lines = str6.lines();
        lines.forEach(System.out::println);
        
        String csv = "apple,orange,banana";
        String csvItems[] = csv.split(",");
        
        for(String item : csvItems)
        {
            System.out.println("Item "+item);
        }
    }
}
