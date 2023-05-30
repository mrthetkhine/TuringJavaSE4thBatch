/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter22;

import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author macbook
 */
public class FileReadWithChannel {
    public static void main(String[] args) {
            Path path = Path.of("./src/main/java/com/turing/javase4thbatch/chapter22/PathDemo.java");
            
            int count;
            try(SeekableByteChannel channel = Files.newByteChannel(path))
            {
                ByteBuffer buffer = ByteBuffer.allocate(128);
                
                do
                {
                    count = channel.read(buffer);
                    if(count != -1)
                    {
                        System.out.println("Rewind-----");
                        buffer.rewind();
                        for (int i = 0; i < count; i++) {
                            System.out.print((char)buffer.get());
                        }
                    }
                }while(count!=-1);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
    }
}
