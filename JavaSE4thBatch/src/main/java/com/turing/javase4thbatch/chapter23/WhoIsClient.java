/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter23;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author macbook
 */
public class WhoIsClient {
    public static void main(String[] args) throws IOException {
        try
        {
            Socket socket = new Socket("whois.internic.net",43);
            System.out.println("Own port "+ socket.getPort());
            
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            
            String str = "ns1.google.com";
            byte[] bytes = str.getBytes();
            out.write(bytes);
            out.flush();
            //out.close();
            int c; 
            while( (c=in.read())!=-1)
            {
                System.out.print((char)c);
            }
            socket.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
