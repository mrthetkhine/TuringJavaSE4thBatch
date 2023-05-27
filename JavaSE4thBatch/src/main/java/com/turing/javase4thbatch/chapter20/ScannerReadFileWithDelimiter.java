/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class ScannerReadFileWithDelimiter {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("./src/main/java/com/turing/javase4thbatch/chapter20/data_1.txt");
            Scanner scanner = new Scanner(fileReader);
            scanner.useDelimiter(",");
            while( scanner.hasNextInt())
            {
                System.out.println("Double "+scanner.nextInt());
            }
            String str = scanner.next();
            System.out.println("Str "+str);
            scanner.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
