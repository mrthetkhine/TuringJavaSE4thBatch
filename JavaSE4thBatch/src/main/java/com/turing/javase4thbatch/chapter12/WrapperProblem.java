/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter12;

/**
 *
 * @author macbook
 */
public class WrapperProblem {
    public static void main(String[] args) {
        Integer i = 127;
        Integer j = 127;
        
        System.out.println("i==j "+ (i==j));
        
        i = 128;
        j = 128;
        
        System.out.println("Ref eq "+ (i==j));
        
        i = new Integer(127);
        j = new Integer(127);
        
        System.out.println("Ref eq "+ (i==j));
        
        i = Integer.valueOf(127);
        j = Integer.valueOf("127");
        
        System.out.println("Ref eq "+ (i==j));
        System.out.println("i==j "+ (i.intValue()==j.intValue()));
        
        System.out.println("i == 127 "+ (i.intValue() == 127));
    }
}
