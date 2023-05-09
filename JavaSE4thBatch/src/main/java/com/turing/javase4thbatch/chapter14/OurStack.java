/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter14;

/**
 *
 * @author macbook
 */
public class OurStack {
    private static final int SIZE = 10;
    private int data [] = new int[SIZE];
    int top = -1;
    
    public void push(int element)
    {
        this.data[++top] = element;
    }
    public int pop()
    {
        return this.data[top--];
    }
    
    public static void main(String[] args) {
        OurStack stack = new OurStack();
        stack.push(100);
        stack.push(200);
        
        System.out.println("Stack.pop "+stack.pop());
    }
}
