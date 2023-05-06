/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter12;

/**
 *
 * @author macbook
 */
enum Size
{
    Medium(2),Small(1),Large(3);
    private int value;
    
    Size(int value)
    {
        this.value = value;
    }
    int getValue()
    {
        return this.value;
    }
}
public class EnumConstructor {
    
    public static void main(String[] args) {
        for (Size size : Size.values()) {
            System.out.println("Size "+size + " value "+size.getValue() + " Ordinal "+size.ordinal());
        }
        Size s1 = Size.Medium;
        Size s2 = Size.Small;
        int result = s1.compareTo(s2);
        System.out.println("Result "+result);
    }
}
