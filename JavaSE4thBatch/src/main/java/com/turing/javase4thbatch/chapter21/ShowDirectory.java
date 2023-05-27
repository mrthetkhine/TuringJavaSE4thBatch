/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter21;

import java.io.File;

/**
 *
 * @author macbook
 */
public class ShowDirectory {
    public static void main(String[] args) {
        File file = new File("./src/main/java/com/turing/javase4thbatch/chapter21");
        
        for (File f : file.listFiles()) {
            System.out.println("File "+f.getName());
        }
        File data = new File("./src/main/java/com/turing/javase4thbatch/chapter21/hello.txt");
        data.renameTo(new File("./src/main/java/com/turing/javase4thbatch/chapter21/data.txt"));
        
        File fileToDelete = new File("./src/main/java/com/turing/javase4thbatch/chapter21/data_1.txt");
        fileToDelete.delete();
    }
}
