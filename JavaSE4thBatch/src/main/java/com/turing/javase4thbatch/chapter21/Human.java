/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter21;

import java.io.Serializable;
  
/**
 *
 * @author macbook
 */
public class Human implements Serializable{
    public static long serialVersionUID = 1L;
    String name;
    int age;
    
    Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    public static void main(String[] args) {
        System.out.println("Do Nothing");
    }
}
