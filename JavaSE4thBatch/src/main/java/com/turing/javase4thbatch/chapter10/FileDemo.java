/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter10;

import java.io.File;

/**
 *
 * @author macbook
 */
public class FileDemo {
    public static void main(String[] args) {
        
        File file = new File("./StackDemo.java");
        System.out.println("isFile "+file.isFile());
        //file.isFile();
    }
}
