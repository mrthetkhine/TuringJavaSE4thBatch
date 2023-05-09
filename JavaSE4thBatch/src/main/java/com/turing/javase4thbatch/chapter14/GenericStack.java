/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter14;

/**
 *
 * @author macbook
 */
public class GenericStack<T> {
    private static final int SIZE = 10;
    private T data[];
    int top = -1;
    
    GenericStack()
    {
        this.data = (T[]) new Object[SIZE];
        System.out.println("T Type "+ this.data.getClass());
    }
    public void push(T element)
    {
        this.data[++top] = element;
    }
    public T pop()
    {
        return this.data[top--];
    }
    public static void main(String[] args) {
        GenericStack<String> strStack = new GenericStack<>();
        strStack.push("Hello");
        strStack.push("How");
        
        String element = strStack.pop();
        System.out.println("Element "+element);
        
        GenericStack<Integer> iStack = new GenericStack<>();
        iStack.push(100);
        iStack.push(200);
        
        System.out.println("Pop "+iStack.pop());
    }
}
