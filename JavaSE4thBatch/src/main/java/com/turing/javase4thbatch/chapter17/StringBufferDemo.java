/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter17;

/**
 *
 * @author macbook
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("item");
        buffer.delete(0, 2);
        
        buffer.insert(0, "hello");
        buffer.replace(0, 5, "how0");
        System.out.println("Buffer "+buffer.toString());
    }
}
