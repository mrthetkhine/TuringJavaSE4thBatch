/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class ChannelCopy {
    public static void main(String[] args) {
        Path source = Path.of("./src/main/java/com/turing/javase4thbatch/chapter22/test.txt");
        Path dest = Path.of("./src/main/java/com/turing/javase4thbatch/chapter22/test_copy.txt");
        
        try {
            Files.copy(source, dest,StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
