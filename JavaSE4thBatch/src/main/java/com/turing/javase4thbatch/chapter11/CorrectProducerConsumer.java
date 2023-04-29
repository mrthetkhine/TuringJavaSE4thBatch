/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter11;

/**
 *
 * @author macbook
 */
class Q
{
    int n;
    boolean valueSet = false;
    
    synchronized int get()
    {
        while(!valueSet)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Got "+n);
        valueSet = false;
        notify();
        return this.n;
    }
    synchronized void put(int n)
    {
        while(valueSet)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Put "+n);
        valueSet = true;
        this.n = n;
        notify();
    }
}
class Producer implements Runnable
{
    Q q;
    Thread thread;
    
    Producer(Q q)
    {
        this.q = q;
        this.thread = new Thread(this);
    }
    public void start()
    {
        this.thread.start();
    }
    @Override
    public void run() {
        int i = 0;
        while(true)
        {
            q.put(i++);
        }
    }
    
}
class Consumer implements Runnable
{
     Q q;
    Thread thread;
    
    Consumer(Q q)
    {
        this.q = q;
        this.thread = new Thread(this);
    }
    public void start()
    {
        this.thread.start();
    }
    @Override
    public void run() {
        int i = 0;
        while(true)
        {
            System.out.println("GetBy Consumer "+q.get());
        }
    }
}
public class CorrectProducerConsumer {
    public static void main(String[] args) {
        Q q = new Q();
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);
        
        producer.start();
        consumer.start();
    }
}
