/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class WrapperDemo {
    public static void main(String[] args) {
        Integer i = Integer.parseInt("10");
        
        System.out.println("I "+i);
        System.out.println("ValueOf "+ i.intValue());
        
        System.out.println("IsLetter "+ Character.isLetter('a'));
    }
}
