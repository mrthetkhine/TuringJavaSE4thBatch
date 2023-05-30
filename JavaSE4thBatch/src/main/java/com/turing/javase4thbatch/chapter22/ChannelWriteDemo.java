/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter22;

import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author macbook
 */
public class ChannelWriteDemo {
    public static void main(String[] args) {
        Path path = Path.of("./src/main/java/com/turing/javase4thbatch/chapter22/test.txt");

        int count;
        try(FileChannel channel = (FileChannel)Files.newByteChannel(path,
                                        StandardOpenOption.WRITE,
                                        StandardOpenOption.CREATE))
        {
            ByteBuffer buffer = ByteBuffer.allocate(26);
            for (int i = 0; i < 26; i++) {
                buffer.put((byte)('A'+i));
            }
            buffer.rewind();
            
            channel.write(buffer);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
