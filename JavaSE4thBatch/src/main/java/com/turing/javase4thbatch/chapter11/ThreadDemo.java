/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter11;

/**
 *
 * @author macbook
 */
class CountThread extends Thread
{
    String name;
    CountThread(String name)
    {
        this.name = name;
    }
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread "+name+" "+ i);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        CountThread th1 = new CountThread("one");
        CountThread th2 = new CountThread("two");
        CountThread th3 = new CountThread("three");
        
        th1.setPriority(Thread.MAX_PRIORITY);
        th1.start();
        th2.start();
        th3.start();
    }
}
