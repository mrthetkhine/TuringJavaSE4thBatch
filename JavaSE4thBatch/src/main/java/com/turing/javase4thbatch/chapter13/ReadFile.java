package com.turing.javase4thbatch.chapter13;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macbook
 */
public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("./");
            System.out.println("File "+file.getAbsolutePath());
            FileInputStream fin = new FileInputStream("./src/main/java/com/turing/javase4thbatch/chapter13/hello.txt");
            
            int data;
            
            try
            {
                do
                {
                    data = fin.read();
                    if(data != -1)
                    {
                        System.out.print((char)data);
                    }
                }while(data != -1);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            finally
            {
                try {
                    fin.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            
                    
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
