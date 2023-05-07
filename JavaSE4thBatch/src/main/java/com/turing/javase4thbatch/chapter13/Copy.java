/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class Copy {
    public static void main(String[] args) {
        try(var fin = new FileInputStream("./src/main/java/com/turing/javase4thbatch/chapter13/hello.txt");
            var fout = new FileOutputStream("./src/main/java/com/turing/javase4thbatch/chapter13/hello_clone.txt"))
        {
             int data;
            
            try
            {
                do
                {
                    data = fin.read();
                    if(data != -1)
                    {
                        fout.write(data);
                        System.out.print((char)data);
                    }
                }while(data != -1);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
