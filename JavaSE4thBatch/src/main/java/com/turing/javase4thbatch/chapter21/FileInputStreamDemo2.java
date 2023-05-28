/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author macbook
 */
public class FileInputStreamDemo2 {
    public static void main(String[] args) {
        int data;
        
        File file = new File("./src/main/java/com/turing/javase4thbatch/chapter21/FileInputStreamDemo.java");
        File outFile = new File("./src/main/java/com/turing/javase4thbatch/chapter21/FileInputStreamDemo.txt");
        try(FileInputStream fin = new FileInputStream(file);
            FileOutputStream fout = new FileOutputStream(outFile))
        {
            System.out.println("Available Bytes "+(fin.available()));
            
            while( (data=fin.read()) != -1)
            {
                System.out.print((char)data);
                fout.write((byte)data);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
