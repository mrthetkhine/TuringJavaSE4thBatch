/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter23;

import java.io.DataInputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author macbook
 */
public class UrlDemo {
    public static void main(String[] args) {
        try
        {
            URL http = new URL("http://www.google.com");
            System.out.println("Protocol "+http.getProtocol());
            System.out.println("Get port "+http.getPort());
            System.out.println("Path "+ http.getPath());
            
            URLConnection conn = http.openConnection();
            
            DataInputStream din = new DataInputStream(conn.getInputStream());
            
            int data;
            while( (data=din.read())!=-1)
            {
                System.out.print((char)data);
            }
            din.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
