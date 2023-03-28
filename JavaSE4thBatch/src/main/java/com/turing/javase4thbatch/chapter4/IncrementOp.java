/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class IncrementOp {
    public static void main(String[] args) {
        int counter = 0;
        int c = counter++;
        int d = ++ counter;
        
        System.out.println("Counter "+counter);
        System.out.println("c "+c);
        System.out.println("d "+d);
    }
}
