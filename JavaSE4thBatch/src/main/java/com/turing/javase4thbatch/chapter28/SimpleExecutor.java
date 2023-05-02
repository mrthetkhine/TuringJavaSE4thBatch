/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author macbook
 */
class MyThread extends Thread
{
    CountDownLatch latch;
    String name;
    
    MyThread(CountDownLatch latch,String name)
    {
        this.latch = latch;
        this.name = name;
    }
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Name "+name+ " i "+i);
            this.latch.countDown();
        }
    }
}
public class SimpleExecutor {
    public static void main(String[] args) {
        CountDownLatch cdl1 = new CountDownLatch(5);
        CountDownLatch cdl2 = new CountDownLatch(5);
        CountDownLatch cdl3 = new CountDownLatch(5);
        CountDownLatch cdl4 = new CountDownLatch(5);
        
        ExecutorService es = Executors.newFixedThreadPool(3);
        //es = Executors.newCachedThreadPool();
        es = Executors.newScheduledThreadPool(3);
        System.out.println("Starting");
        es.execute(new MyThread(cdl1,"A"));
        es.execute(new MyThread(cdl2,"B"));
        es.execute(new MyThread(cdl3,"C"));
        es.execute(new MyThread(cdl4,"D"));
        
        try
        {
            cdl1.await();
            cdl2.await();
            cdl3.await();
            cdl4.await();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        es.shutdown();
        System.out.println("Done");
    }
}
