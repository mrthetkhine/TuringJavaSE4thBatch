/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.oop;

/**
 *
 * @author macbook
 */
public class Account {
    private int balance;
    void credit(int amount)
    {
        if(amount >0)
        {
            this.balance += amount;
        }
        else
        {
            throw new RuntimeException("Invalid Credit");
        }
    }
    void debit(int amount)
    {
        if(this.balance>= amount && amount >0)
        {
            this.balance -= amount;
        }
        else
        {
            throw new RuntimeException("Invalid debit");
        }      
       
    }
    int getBalance()
    {
        return balance;
    }
}
