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
class HttpClientHandler extends Thread
{
    Socket socket;
    HttpClientHandler(Socket socket)
    {
        this.socket = socket;
    }
    public void run()
    {
        try(DataInputStream din = new DataInputStream(socket.getInputStream());
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream()))
        {
            String requestLine = din.readLine();
            System.out.println("Request line "+ requestLine);
            
            String []tokens = requestLine.split(" ");
            System.out.println("Request resource "+ tokens[1]);
            
            String reponse = "HTTP/1.1 200 OK\r\n"
                            +"\r\n"
                            +"<html>Hello World</html>\r\n";
            dout.writeBytes(reponse);
            dout.flush();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class HttpServer {
    
    ServerSocket serverSocket ;
    HttpServer() throws IOException
    {
        this.serverSocket = new ServerSocket(8080);
        this.run();
    }
    public void run()
    {
        while(true)
        {
            try
            {
                Socket socket = this.serverSocket.accept();
                System.out.println("Get client connection "+socket.getPort());
                
                HttpClientHandler handler = new HttpClientHandler(socket);
                handler.start();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        try {
            new HttpServer();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Serer started 8080");
    }
}
