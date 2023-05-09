/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter14;

/**
 *
 * @author macbook
 */
public class AnotherStack {
    private static final int SIZE = 10;
    private Object data[] = new Object[SIZE];
    int top = -1;
    
    public void push(Object element)
    {
        this.data[++top] = element;
    }
    public Object pop()
    {
        return this.data[top--];
    }
    
    public static void main(String[] args) {
        AnotherStack stack = new AnotherStack();
        stack.push(100);
        stack.push("Hello");
        stack.push(200);
        
        System.out.println("Stack.pop "+stack.pop());
        
        int element = (Integer) stack.pop();
        System.out.println("Element "+element);
        
        AnotherStack stack2 = new AnotherStack();
        stack2.push("Hello");
        stack2.push("How are you");
        
        System.out.println("Stack.pop "+stack2.pop());
    }
}
