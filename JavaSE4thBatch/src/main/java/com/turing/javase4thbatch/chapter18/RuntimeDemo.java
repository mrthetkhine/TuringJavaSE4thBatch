/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter18;

import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author macbook
 */
public class RuntimeDemo {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("ls -la");
            InputStream in = process.getInputStream();
            
            int data ;
            while((data= in.read()) !=-1)
            {
                System.out.print((char)data);
            }
            in.close();
            
            Runtime r = Runtime.getRuntime();
            System.out.println("TotalMemory "+r.totalMemory());
            System.out.println("FreeMemory "+r.freeMemory());
            
            double darr[] = new double[200000];
            System.out.println("FreeMemory "+r.freeMemory());
            darr = null;
            
            System.gc();
            System.out.println("FreeMemory "+r.freeMemory());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
