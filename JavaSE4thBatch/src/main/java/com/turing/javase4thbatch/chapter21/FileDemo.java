/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter21;

import java.io.File;
import java.io.FileReader;

/**
 *
 * @author macbook
 */
public class FileDemo {
    public static void main(String[] args) {
          File file = new File("./src/main/java/com/turing/javase4thbatch/chapter21/data.txt");
          
          System.out.println("IsExist "+file.exists());
          System.out.println("IsFile "+file.isFile());
          System.out.println("IsDir "+file.isDirectory());
          System.out.println("Absolute Path "+file.getAbsolutePath());
          System.out.println("Parent "+file.getParent());
          System.out.println("Path "+file.getPath());
          System.out.println("Can Read "+file.canRead());
          System.out.println("Can execute "+file.canExecute());
          System.out.println("Can write "+file.canWrite());
          System.out.println("Filesize "+file.length());
    }
    
}
