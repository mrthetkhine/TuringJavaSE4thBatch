/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class ShortCircuitLogical {
    
    static boolean getFalse()
    {
        System.out.println("GetFalse");
        return false;
    }
    static boolean getTrue()
    {
        System.out.println("GetTrue");
        return true;
    }
    
    public static void main(String[] args) {
        boolean data = getTrue() || getFalse() ;
        System.out.println("Data "+data);
        
        data = getTrue() | getFalse() ;
        System.out.println("Data "+data);
        
        data = getFalse() && getTrue();
        System.out.println("Data "+data);
        
        data = getTrue() && getFalse();
        System.out.println("Data "+data);
    }
}
