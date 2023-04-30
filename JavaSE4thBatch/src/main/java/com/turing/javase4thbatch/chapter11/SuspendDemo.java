/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter11;

/**
 *
 * @author macbook
 */

class NewThread implements Runnable
{
    String name;
    Thread thread;
    boolean suspendFlag;
    
    NewThread(String name)
    {
        this.name = name;
        this.thread = new Thread(this);
        this.suspendFlag = false;
        this.thread.start();
    }
    @Override
    public void run() {
        try
        {
            for (int i = 15; i > 0; i--) {
                System.out.println("Thread "+name + " i = "+i);
                Thread.sleep(200);
                synchronized(this)
                {
                    while(suspendFlag)
                    {
                        wait();
                    }
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void start()
    {
        this.thread.start();
    }
    public synchronized void suspend()
    {
        this.suspendFlag = true;
    }
    public synchronized void resume()
    {
        this.suspendFlag = false;
        notify();
    }
    
}

public class SuspendDemo {
    public static void main(String[] args) {
        NewThread t1 = new NewThread("One");
        NewThread t2 = new NewThread("Two");
        
        
        try
        {
            Thread.sleep(1000);
            t1.suspend();
            System.out.println("Suspending t1");
            
            Thread.sleep(1000);
            t1.resume();
            System.out.println("Resuming t1");
            
            Thread.sleep(1000);
            t2.suspend();
            System.out.println("Suspending t2");
            
            Thread.sleep(1000);
            t2.resume();
            System.out.println("Resuming t2");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
