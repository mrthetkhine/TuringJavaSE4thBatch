/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author macbook
 */
class MyThread extends Thread
{
    CyclicBarrier barrier;
    String name;
    
    MyThread(CyclicBarrier barrier, String name)
    {
        this.barrier = barrier;
        this.name = name;
    }
    public void run()
    {
        System.out.println("Thread "+name + " await");
        try
        {
            this.barrier.await();
            System.out.println("Thread "+name+" unlock ");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
class BarAction implements Runnable
{
    public void run()
    {
        System.out.println("Barrier reached");
    }
}
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier barrier  = new CyclicBarrier(3, new BarAction());
        
        MyThread t1 = new MyThread(barrier, "one");
        MyThread t2 = new MyThread(barrier, "two");
        MyThread t3 = new MyThread(barrier, "three");
        
        t1.start();
        t2.start();
        t3.start();
               
    }
}
