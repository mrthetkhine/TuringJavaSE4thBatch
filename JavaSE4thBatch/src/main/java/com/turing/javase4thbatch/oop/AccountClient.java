/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.oop;

/**
 *
 * @author macbook
 */
public class AccountClient {
    public static void main(String[] args) {
        Account acc = new Account();
        //acc.balance = 200;
        
        acc.credit(200);
        acc.debit(100);
        System.out.println("getBalance "+acc.getBalance());
    }
}
