/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter19;

import java.util.Stack;



/**
 *
 * @author macbook
 */
public class StackDemo {
    public static void main(String[] args) {
        //LIFO
        Stack<String> stack = new Stack<String>();
        stack.push("one");
        stack.push("two");
        
        System.out.println("Peek "+stack.peek());
        System.out.println("Pop "+stack.pop());
        System.out.println("Pop "+stack.pop());
        System.out.println("Empty "+stack.empty());    
    }
}
