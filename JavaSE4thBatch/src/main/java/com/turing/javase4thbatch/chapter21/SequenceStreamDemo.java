/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class InputStreamEnumerator implements Enumeration<FileInputStream>
{
    private Enumeration<String> files;
    
    InputStreamEnumerator(Vector<String> files)
    {
        this.files = files.elements();
    }
    @Override
    public boolean hasMoreElements() {
        return this.files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try {
            return new FileInputStream(this.files.nextElement());
        } catch (FileNotFoundException ex) {
           return null;
        }
    }
    
}
public class SequenceStreamDemo {
    public static void main(String[] args) {
        Vector<String> files = new Vector<String>();
        files.add("./src/main/java/com/turing/javase4thbatch/chapter21/FileInputStreamDemo.java");
        files.add("./src/main/java/com/turing/javase4thbatch/chapter21/FileInputStreamDemo2.java");
        files.add("./src/main/java/com/turing/javase4thbatch/chapter21/FilterDemo.java");
        
        InputStreamEnumerator enumerator = new InputStreamEnumerator(files);
        
        try(InputStream in = new SequenceInputStream(enumerator))
        {
            int data;
            while( (data=in.read()) != -1)
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
