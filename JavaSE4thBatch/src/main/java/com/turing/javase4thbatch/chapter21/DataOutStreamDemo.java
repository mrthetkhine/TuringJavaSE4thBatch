/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter21;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author macbook
 */
public class DataOutStreamDemo {
    public static void main(String[] args) {
        File file = new File("./src/main/java/com/turing/javase4thbatch/chapter21/dataout.out");
        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream(file)))
        {
            dout.writeInt(100);
            dout.writeInt(200);
            dout.writeInt(300);
            dout.writeUTF("Hello");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
