/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter22;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author macbook
 */
class FileVisitor extends SimpleFileVisitor<Path>
{
    public FileVisitResult visitFile(Path path,BasicFileAttributes attrib)
    {
        System.out.println("Path "+path);
        return FileVisitResult.CONTINUE;
    }
}
public class WalkFileTreeDemo {
    public static void main(String[] args) {
        Path dir = Path.of("./src/main/java/com/turing/javase4thbatch/chapter22");
        try
        {
            Files.walkFileTree(dir, new FileVisitor());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
