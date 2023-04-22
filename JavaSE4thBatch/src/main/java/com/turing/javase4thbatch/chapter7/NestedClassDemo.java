/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter7;

/**
 *
 * @author macbook
 */
class Outer
{
    int outerX = 100;
    void outerMethod()
    {
        Inner inner = new Inner();
        inner.display();
    }
    class Inner
    {
        void display()
        {
            System.out.println("Inner display outer x "+outerX);
        }
    }
}
public class NestedClassDemo {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.outerMethod();
    }
}
