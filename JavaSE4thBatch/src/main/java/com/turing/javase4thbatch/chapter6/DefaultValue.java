/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class DefaultValue {
    int num;
    double dec;
    boolean flag;
    String msg;
    
    public static void main(String[] args) {
        DefaultValue value = new DefaultValue();
        
        System.out.println("Num "+value.num);
        System.out.println("Dec "+value.dec);
        System.out.println("Flag "+value.flag);
        System.out.println("Msg "+ value.msg);
    }
}
