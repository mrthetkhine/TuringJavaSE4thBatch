/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.Phaser;

/**
 *
 * @author macbook
 */
class MyThread extends Thread
{
    Phaser phaser;
    String name;
    
    MyThread(Phaser phaser,String name)
    {
        this.phaser = phaser;
        this.name = name;
        this.phaser.register();
    }
    
    public void run()
    {
        
        System.out.println("Name "+name+" Beginning phase one");
        this.phaser.arriveAndAwaitAdvance();
        try
        {
            Thread.sleep(100);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        System.out.println("Name "+name+" Beginning phase two");
        this.phaser.arriveAndAwaitAdvance();
        try
        {
            Thread.sleep(100);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Name "+name+" Beginning phase three");
        this.phaser.arriveAndAwaitAdvance();
         try
        {
            Thread.sleep(100);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        this.phaser.arriveAndDeregister();
    }
}
public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase = 1;
        
        MyThread t1 = new MyThread(phaser,"one");
        MyThread t2 = new MyThread(phaser,"two");
        MyThread t3 = new MyThread(phaser,"three");
        
        t1.start();
        t2.start();
        t3.start();
        
        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+curPhase+" completed"); 
        
        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+curPhase+" completed"); 
        
        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+curPhase+" completed"); 
        
        phaser.arriveAndDeregister();
    }
}
