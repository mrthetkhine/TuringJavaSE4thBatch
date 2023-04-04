/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter6;

/**
 *
 * @author macbook
 */
class Account
{
   private long balance = 0;
   
   void debit(int amount)
   {
       if(amount >=0 && amount <= balance)
       {
            this.balance -= amount;
       }
      
   }
   void credit(int amount)
   {
       if(amount >=0)
       {
           this.balance += amount;
       }
       
   }
   public String toString()
   {
       return "Account => "+balance;
   }
}
public class AccountDemo {
    public static void main(String[] args) {
        Account account1 = new Account();
        
        account1.credit(5000);
        account1.debit(2000);
        
        Account account2 = new Account();
        account2.credit(40);
        
        System.out.println("Account "+account1);
        System.out.println("Account2 "+account2);
    }
}
