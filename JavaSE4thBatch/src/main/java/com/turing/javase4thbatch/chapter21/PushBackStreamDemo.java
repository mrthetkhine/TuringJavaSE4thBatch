/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter21;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

/**
 *
 * @author macbook
 */
public class PushBackStreamDemo {
    public static void main(String[] args) {
        String str = "Hello World from Java";
        ByteArrayInputStream bin = new ByteArrayInputStream(str.getBytes());
        
        try(PushbackInputStream pIn = new PushbackInputStream(bin))
        {
            int data;
            for (int i = 0; i < 10; i++) {
                System.out.print((char) (data=pIn.read()));
                
                if(i > 5)
                {
                    pIn.unread(data);
                }
            }
            
           
            System.out.println("");
            for (int i = 0; i < 10; i++) {
                System.out.print((char)pIn.read());
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
