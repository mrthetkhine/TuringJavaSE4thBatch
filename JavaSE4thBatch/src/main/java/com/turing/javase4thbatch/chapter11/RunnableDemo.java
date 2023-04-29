/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter11;

/**
 *
 * @author macbook
 */
class JustThread implements Runnable
{
    Thread thread;

    JustThread()
    {
        this.thread = new Thread(this);
        
    }
    void start()
    {
        this.thread.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread.name "+ this.thread.getName()+" "+i);
        }
    }
    
}
public class RunnableDemo {
    public static void main(String[] args) {
        JustThread t1 = new JustThread();
        JustThread t2 = new JustThread();
        
        t1.start();
        t2.start();
    }
}
