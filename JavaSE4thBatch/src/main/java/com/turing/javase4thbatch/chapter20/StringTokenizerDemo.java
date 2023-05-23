package com.turing.javase4thbatch.chapter20;


import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macbook
 */
public class StringTokenizerDemo {
    public static void main(String[] args) {
        String str ="int a=20;";
        
        StringTokenizer tokenizer = new StringTokenizer(str, " = ;",true);
        while(tokenizer.hasMoreTokens())
        {
            System.out.println("Token "+tokenizer.nextToken());
        }
    }
}
