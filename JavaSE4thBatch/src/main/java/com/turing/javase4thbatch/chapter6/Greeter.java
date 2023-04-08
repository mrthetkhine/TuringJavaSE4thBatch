/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class Greeter {
    String greet(String name)
    {
        return "Hello "+name;
    }
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        String msg = greeter.greet("Mg Mg");
        
        System.out.println("Msg "+msg);
        
        msg = greeter.greet("Augn Aung");
        System.out.println("Msg "+msg);
    }
    
}
