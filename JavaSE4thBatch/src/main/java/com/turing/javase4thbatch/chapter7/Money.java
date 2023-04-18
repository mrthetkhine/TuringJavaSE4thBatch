/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class Money {
    int amount;
    Money(int amount)
    {
        this.amount = amount;
    }
    Money add(Money another)
    {
        int total = another.amount + this.amount;
        return new Money(total);
    }
    public static void main(String[] args) {
        Money a = new Money(10);
        Money b = new Money(5);
        Money c = a.add(b);
        
        System.out.println("Money c"+ c.amount);
    }
}
