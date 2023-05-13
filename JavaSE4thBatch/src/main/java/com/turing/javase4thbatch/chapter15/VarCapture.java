/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter15;

/**
 *
 * @author macbook
 */
interface SomeOp
{
    int func(int a);
}
public class VarCapture {
    public static void main(String[] args) {
        int k = 10;
        SomeOp op = (x)->{
            //k++;
            return x+ k;
        };
        //k = 20;
        System.out.println("Op "+op.func(20));
    }
}
