/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter23;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class UDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
             byte [] buffer = new byte[1024];
             
             Random random = new Random();
             String request = "Hello from client ="+random.nextInt(300);
             
             buffer = request.getBytes();
             DatagramPacket packet = new DatagramPacket(buffer, buffer.length,
                     InetAddress.getLocalHost(),3000);
             
            socket.send(packet);
             
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
