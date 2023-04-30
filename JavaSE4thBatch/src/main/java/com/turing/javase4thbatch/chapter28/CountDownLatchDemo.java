/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @author macbook
 */
class MyThread extends Thread
{
    CountDownLatch latch;
    MyThread(CountDownLatch latch)
    {
        this.latch = latch;
    }
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            this.latch.countDown();
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);
        System.out.println("Starting");
        
        MyThread t = new MyThread(cdl);
        t.start();
        
        try
        {
            System.out.println("Start calling await");
            cdl.await();
            System.out.println("Done");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
