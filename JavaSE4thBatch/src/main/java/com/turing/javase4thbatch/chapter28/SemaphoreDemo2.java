/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class Shared
{
    static int count = 0;
}
class IncThread extends Thread
{
    String name;
    Semaphore sem;
    
    IncThread(String name, Semaphore sem)
    {
        this.name = name;
        this.sem = sem;
    }
    public void run()
    {
        System.out.println("Starting "+name);
        try
        {
            System.out.println("Waiting for permit "+name);
            sem.acquire();
            System.out.println("Lock acquired by "+name);
            for (int i = 0; i < 5; i++) {
                Shared.count ++;
                System.out.println("Shared count "+ Shared.count);
                Thread.sleep(100);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Release lock "+this.name);
            //this.sem.release();
        }
        
       
    }
}
class DecThread extends Thread
{
    String name;
    Semaphore sem;
    
    DecThread(String name, Semaphore sem)
    {
        this.name = name;
        this.sem = sem;
    }
    public void run()
    {
        System.out.println("Starting "+name);
        try
        {
            System.out.println("Waiting for permit "+name);
            sem.acquire();
            System.out.println("Lock acquired by "+name);
            for (int i = 0; i < 5; i++) {
                Shared.count --;
                System.out.println("Shared count "+ Shared.count);
                Thread.sleep(100);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Release lock "+this.name);
            this.sem.release();
        }
        
       
    }
}
public class SemaphoreDemo2 {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        IncThread t1 = new IncThread("IncThread",sem);
        DecThread t2 = new DecThread("DecThread",sem);
        
        t1.start();
        t2.start();
        
         try {
            
            t1.join();
            t2.join();
          
            
            System.out.println("Counter "+ Shared.count);
            System.out.println("is Alive "+t1.isAlive());
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
