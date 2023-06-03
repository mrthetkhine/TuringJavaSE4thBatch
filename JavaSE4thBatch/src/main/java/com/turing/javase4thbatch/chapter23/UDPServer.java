/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter23;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author macbook
 */
public class UDPServer {
    public static void main(String[] args) {
        
        try
        {
            DatagramSocket socket = new DatagramSocket(3000);
            byte [] buffer = new byte[1024];
            while(true)
            {
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);
                
                System.out.println("Data received from client "+ new String(buffer));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
