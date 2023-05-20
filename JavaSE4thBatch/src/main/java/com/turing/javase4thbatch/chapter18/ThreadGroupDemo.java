/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter18;

/**
 *
 * @author macbook
 */
class MyThread extends Thread
{
    String name;
    MyThread(String name,ThreadGroup tg)
    {
        super(tg,name);
        this.name = name;
    }
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Name "+name  + " i "+i);
        }
    }
}
public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("GroupA");
        
        MyThread t1 = new MyThread("one",tg);
        MyThread t2 = new MyThread("two",tg);
        
        t1.start();
        t2.start();
        
        tg.list();
        System.out.println("Active Count "+tg.activeCount());
    }
}
