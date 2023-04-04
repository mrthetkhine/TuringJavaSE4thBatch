/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter6;

/**
 *
 * @author macbook
 */

public class ClassDemo {
    static void work(String name, int age)
    {
        System.out.println("Name "+name + " Age "+age + " work");
    }
    public static void main(String[] args) {
        String name1 = "TK";
        int age1 = 38;
        
        String name2 = "Aung Aung";
        int age2 = 35;
        
        work(name1,age1);
        work(name2,age1);
    }
}
