/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter23;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author macbook
 */
public class EchoClient {
    public static void main(String[] args) {
        Random random = new Random();
        try
        {
            Socket socket = new Socket("localhost",8000);
            try(DataInputStream din = new DataInputStream(socket.getInputStream());
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream()))
            {
               
                String request = "Hello"+random.nextInt(399);
                dout.writeUTF(request);
                
                String response = din.readUTF();
                System.out.println("Resonse from server "+response);
            }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
