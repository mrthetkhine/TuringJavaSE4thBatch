/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter13;

/**
 *
 * @author macbook
 */
public class Human {
    String name ;
    int age;
    Human(String name)
    {
        this(name,0);
        System.out.println("One Argument constructor");
    }
    Human(String name,int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Two argument constructor");
    }
    public static void main(String[] args) {
        Human h = new Human("TK");
    }
}
