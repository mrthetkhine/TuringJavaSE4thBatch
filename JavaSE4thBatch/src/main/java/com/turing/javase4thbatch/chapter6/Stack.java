/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class Stack {
    int items [] = new int[10];
    int top = -1;
    
    public void push(int element)
    {
        items[++top] = element;
    }
    public int pop()
    {
        return items[top--];
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        
        int ele = st.pop();
        System.out.println("Ele "+ele);
        
        ele = st.pop();
        System.out.println("Ele "+ele);
    }
         
}
