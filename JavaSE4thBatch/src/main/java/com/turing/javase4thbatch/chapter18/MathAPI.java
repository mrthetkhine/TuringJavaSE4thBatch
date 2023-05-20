/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class MathAPI {
    static double toRadian(int degree)
    {
        return degree * Math.PI/ 180;
    }
    public static void main(String[] args) {
        System.out.println("Min "+Math.min(3, -4));
        System.out.println("Sin 90 "+ Math.sin(toRadian(90)));
    }
}
