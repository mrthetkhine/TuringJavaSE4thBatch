/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter21;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author macbook
 */
class CustomFilter implements FilenameFilter
{
    String ext ;
    
    CustomFilter(String ext)
    {
        this.ext = "."+ext;
    }
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(this.ext);
    }
    
}
public class FilterDemo {
    public static void main(String[] args) {
        File file = new File("./src/main/java/com/turing/javase4thbatch/chapter21");
        
        CustomFilter filter = new CustomFilter("java");
        
        for (File f : file.listFiles(filter)) {
            System.out.println("File "+f.getName());
        }
        File dir = new File("./src/main/java/com/turing/javase4thbatch/folder");
        //dir.mkdir();
    }
}
