/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class AccountClient {
    public static void main(String[] args) {
        Account acc = new Account();
        
        acc.credit(100);
        acc.debit(20);
        
        System.out.println("Acc "+acc);
    }
}
