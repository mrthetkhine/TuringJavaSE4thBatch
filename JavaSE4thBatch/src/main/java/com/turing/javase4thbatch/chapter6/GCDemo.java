/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class GCDemo {
    public static void main(String[] args) {
        System.gc();
        System.out.println("Free memory "+Runtime.getRuntime().totalMemory());
        double[][]arr = new double[10][10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new double[1000000];
        }
        System.out.println("Free memory "+Runtime.getRuntime().totalMemory());
        
        arr = null;
        System.gc();
        System.out.println("Free memory "+Runtime.getRuntime().totalMemory());
    }
}
