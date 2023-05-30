/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter23;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            
            InetAddress google = InetAddress.getByName("www.google.com");
            System.out.println("Google "+google);
            System.out.println("LocalHost "+localhost);
            
            InetAddress googleIps [] = InetAddress.getAllByName("www.google.com");
            for(InetAddress ip :googleIps)
            {
                System.out.println("Ip "+ip);
                System.out.println("Host name "+ip.getHostName());
            }
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
