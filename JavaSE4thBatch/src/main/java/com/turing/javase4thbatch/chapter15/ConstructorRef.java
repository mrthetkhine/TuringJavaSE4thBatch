/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter15;

/**
 *
 * @author macbook
 */
interface MyFunc
{
    Human func(String name);
}
class Human
{
    String name;
    Human(String name)
    {
        this.name = name;
        System.out.println("Consructor run");
    }
}
public class ConstructorRef {
    public static void main(String[] args) {
        MyFunc func = Human::new;
        
        Human h = func.func("TK");
        System.out.println("H "+h.name);
    }
}
