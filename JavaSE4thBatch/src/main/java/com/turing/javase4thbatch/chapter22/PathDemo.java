/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter22;

import java.nio.file.Path;

/**
 *
 * @author macbook
 */
public class PathDemo {
    public static void main(String[] args) {
        Path path = Path.of("./src/main/java/com/turing/javase4thbatch/chapter22/PathDemo.java");
        System.out.println("Path Name"+path.getFileName());
        System.out.println("Parent "+path.getParent());
        System.out.println("isAbsolute "+path.isAbsolute());
        System.out.println("Start with "+ path.startsWith(Path.of("./src")));
    }
}
