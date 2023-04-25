/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter10;

/**
 *
 * @author macbook
 */
class StackOverflowException extends Exception
{
    public StackOverflowException(String message) {
        super(message);
    }
    
}
class StackUnderflowException extends Exception
{
    public StackUnderflowException(String message) {
        super(message);
    }
}

class Stack
{
    //0-9
    private int[] items = new int[10];
    private int top = -1;
    
    public void push(int element) throws StackOverflowException
    {
        System.out.println("Top "+top);
        if(top >= items.length-1)
        {
            throw new StackOverflowException("Stackoverflow exception");
        }
        else
        {
            this.items[++top] = element;
        }
        
    }
    public int pop()throws StackUnderflowException
    {
        if(top ==-1)
        {
            throw new StackUnderflowException("Stack undeflow excpetion");
        }
        return this.items[top--];
    }
}
public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        try
        {
            for (int i = 0; i < 10; i++) {
                stack.push(i);
            }
            for (int i = 0; i < 11; i++) {
                System.out.println("Pop "+stack.pop());
            }
        }
        catch(StackOverflowException e)
        {
            System.out.println("Error "+e.getMessage());
            e.printStackTrace();
        }
        catch(StackUnderflowException e)
        {
            System.out.println("Error "+e.getMessage());
            e.printStackTrace();
        }
        
    }
}
