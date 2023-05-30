/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter22;

import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author macbook
 */
public class MappedChannelDemo {
    public static void main(String[] args) {
        Path path = Path.of("./src/main/java/com/turing/javase4thbatch/chapter22/PathDemo.java");

        int count;
        try(FileChannel channel = (FileChannel)Files.newByteChannel(path))
        {
            long size = channel.size();
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, size);

           for (int i = 0; i < size; i++) {
                System.out.print((char)buffer.get());
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
