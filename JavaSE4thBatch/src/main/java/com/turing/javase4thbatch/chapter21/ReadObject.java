/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author macbook
 */
public class ReadObject {
    public static void main(String[] args) {
        File file = new File("./src/main/java/com/turing/javase4thbatch/chapter21/object.out");
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file)))
        {
            Human h ;
            h = (Human)in.readObject();
            
            System.out.println("H.name "+h.name);
            System.out.println("H.age "+h.age);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
