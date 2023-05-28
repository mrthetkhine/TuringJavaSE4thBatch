/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter21;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author macbook
 */
public class WriteObject {
    public static void main(String[] args) {
        Human h = new Human("TK",39);
        File file = new File("./src/main/java/com/turing/javase4thbatch/chapter21/object.out");
        try(ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file)))
        {
            oout.writeObject(h);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
