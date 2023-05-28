/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter21;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author macbook
 */
public class DataInputStreamDemo {
    public static void main(String[] args) {
        File file = new File("./src/main/java/com/turing/javase4thbatch/chapter21/dataout.out");
        try(DataInputStream din = new DataInputStream(new FileInputStream(file)))
        {
            int a = din.readInt();
            int b = din.readInt();
            int c = din.readInt();
            //int c=0;
            String d = din.readUTF();
            
            System.out.println("A "+a +" B "+b +" c"+ c + " d "+d);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
