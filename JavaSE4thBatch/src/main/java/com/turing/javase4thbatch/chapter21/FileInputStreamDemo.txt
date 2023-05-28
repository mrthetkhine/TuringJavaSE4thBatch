/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter21;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author macbook
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        
        File file = new File("./src/main/java/com/turing/javase4thbatch/chapter21/FileInputStreamDemo.java");
        try(FileInputStream fin = new FileInputStream(file))
        {
            System.out.println("Available Bytes "+(size = fin.available()));
            
            int n = size /40; 
            for (int i = 0; i < n; i++) {
                System.out.print((char)fin.read());
            }
            
            System.out.println("Available "+fin.available());
            
            byte[]bytes = new byte[n];
            if( fin.read(bytes) != n)
            {
                System.out.println("Could not read");
            }
            System.out.print(new String(bytes,0,n));
            System.out.println("Still avaialble "+(size = fin.available()));
            System.out.println("Skip");
            fin.skip(n/2);
            if( fin.read(bytes, n/2, n/2) != n/2)
            {
                System.out.println("Could not read");
            }
             System.out.print(new String(bytes,0,bytes.length));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
