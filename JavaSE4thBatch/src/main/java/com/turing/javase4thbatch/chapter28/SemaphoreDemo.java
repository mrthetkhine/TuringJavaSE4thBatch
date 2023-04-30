/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter28;

import com.turing.javase4thbatch.chapter11.*;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class Data
{
    int count;
}
class IncThread extends Thread
{
    Data data;
    Semaphore semaphore;
    IncThread(Data data,Semaphore semaphore)
    {
        this.data = data;
        this.semaphore = semaphore;
    }
    public void run()
    {
        for (int i = 0; i < 100000; i++) {
            
            try {
                this.semaphore.acquire();
                this.data.count ++;
                this.semaphore.release();
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            }
            
           
        }
    }
}
public class SemaphoreDemo {
    public static void main(String[] args) {
        Data data = new Data();
            
        Semaphore sem = new Semaphore(1);
        IncThread t1 = new IncThread(data,sem);
        IncThread t2 = new IncThread(data,sem);
        IncThread t3 = new IncThread(data,sem);

        t1.start();
        t2.start();
        t3.start();
        
      
        try {
            
            t1.join();
            t2.join();
            t3.join();
            
            System.out.println("Counter "+ data.count);
            System.out.println("is Alive "+t1.isAlive());
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
