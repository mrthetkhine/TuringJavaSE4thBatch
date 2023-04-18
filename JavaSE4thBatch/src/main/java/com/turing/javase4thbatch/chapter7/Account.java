/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class Account {
    private int balance;
    
    public void debit(int amount)
    {
        if( amount > 0 && this.balance >=  amount)
        {
            this.balance -= amount;
        }
        else
        {
            System.out.println("Invalid debit operation");
        }
    }
    public void credit(int amount)
    {
        if( amount >=0 )
        {
            this.balance += amount;
        }
        else
        {
            System.out.println("Invalid credit operation");
        }
    }
    @Override
    public String toString()
    {
        return "Account [balance "+balance+"]";
    }
}
