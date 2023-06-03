/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter23;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class ClientHandler extends Thread
{
    Socket socket;
    ClientHandler(Socket socket)
    {
        this.socket = socket;
    }
    public void run()
    {
        try(DataInputStream din = new DataInputStream(socket.getInputStream());
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream()))
        {
            String data = din.readUTF();
            System.out.println("Request form client "+data);
            String response = (new Date().toString())+ data;
            
            dout.writeUTF(response);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class EchoServer {
    ServerSocket serverSocket ;
    EchoServer()
    {
        try {
            this.serverSocket = new ServerSocket(8000);
            this.run();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void run()
    {
        while(true)
        {
            try {
                Socket socket = this.serverSocket.accept();
                System.out.println("Client received "+socket.getPort());
                ClientHandler clientThread = new ClientHandler(socket);
                clientThread.run();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        EchoServer server = new EchoServer();
    }
}
