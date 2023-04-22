/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class InnerClassInExp {
    public static void main(String[] args) {
        for(int i=0;i< 10;i++)
        {
            class Inner{
                void method()
                {
                    System.out.println("Method");
                }
            }
            Inner inner = new Inner();
            inner.method();
        }
        //Inner in = new Inner();
    }
}
