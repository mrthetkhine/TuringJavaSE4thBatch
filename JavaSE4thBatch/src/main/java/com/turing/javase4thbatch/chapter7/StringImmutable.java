/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class StringImmutable {
    public static void main(String[] args) {
        String str = "";
        /*
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str += "How are you";
        }
        long end = System.currentTimeMillis();
        
        long time = end - start;
        System.out.println("MS "+time);
    */
        StringBuilder builder = new StringBuilder("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            builder.append( "How are you");
        }
        long end = System.currentTimeMillis();
        
        long time = end - start;
        System.out.println("MS "+time);
    }
}
