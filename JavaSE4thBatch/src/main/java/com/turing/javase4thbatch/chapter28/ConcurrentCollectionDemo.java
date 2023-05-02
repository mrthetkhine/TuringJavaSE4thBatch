/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter28;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class Data
{
    AtomicInteger count = new AtomicInteger();
}
class IncThread extends Thread
{
    Data data;
    IncThread(Data data)
    {
        this.data = data;
    }
    public void run()
    {
        for (int i = 0; i < 100000; i++) {
            this.data.count.addAndGet(1);
        }
    }
}
public class ConcurrentCollectionDemo {
    public static void main(String[] args) {
        Data data = new Data();
            
        System.out.println("Main Thread "+Thread.currentThread().getName());
        IncThread t1 = new IncThread(data);
        IncThread t2 = new IncThread(data);
        IncThread t3 = new IncThread(data);

        t1.start();
        t2.start();
        t3.start();
        
        System.out.println("is Alive "+t1.isAlive());
        try {
            
            t1.join();
            t2.join();
            t3.join();
            
            System.out.println("Counter "+ data.count);
            System.out.println("is Alive "+t1.isAlive());
        } catch (InterruptedException ex) {
            Logger.getLogger(ConcurrentCollectionDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
