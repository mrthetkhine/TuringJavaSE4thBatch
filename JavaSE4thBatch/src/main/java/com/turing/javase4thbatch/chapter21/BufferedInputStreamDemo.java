/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter21;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author macbook
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        int size;
        
        File file = new File("./src/main/java/com/turing/javase4thbatch/chapter21/FileInputStreamDemo.java");
        try(BufferedInputStream fin = new BufferedInputStream(new FileInputStream(file)))
        {
            System.out.println("Available Bytes "+(fin.available()));
            int data;
            while( (data=fin.read()) != -1)
            {
                System.out.print((char)data);
                
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
