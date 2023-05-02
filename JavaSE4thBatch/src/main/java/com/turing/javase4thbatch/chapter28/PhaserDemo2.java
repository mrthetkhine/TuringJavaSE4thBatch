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
class MyThread2 extends Thread
{
    Phaser phaser;
    String name;
    
    MyThread2(Phaser phaser,String name)
    {
        this.phaser = phaser;
        this.name = name;
        this.phaser.register();
    }
    
    public void run()
    {
        while(!this.phaser.isTerminated())
        {
            System.out.println("Thread "+name + " beginning phase "+phaser.getPhase());
            this.phaser.arriveAndAwaitAdvance();
            
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
class MyPhaser extends Phaser
{
    int numOfPhase;
    
    MyPhaser(int parties,int phaseCount)
    {
        super(parties);
        this.numOfPhase = phaseCount - 1;
    }
    protected boolean onAdvance(int p,int registeredParties)
    {
        System.out.println("Phase "+p +" completed ");
        if( p== numOfPhase || registeredParties == 0)
            return true;
        else
            return false;
    }
}
public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phaser =new MyPhaser(1,6);
        
        MyThread2 t1 = new MyThread2(phaser,"one");
        MyThread2 t2 = new MyThread2(phaser,"two");
        MyThread2 t3 = new MyThread2(phaser,"three");
        
        t1.start();
        t2.start();
        t3.start();
        
        while(!phaser.isTerminated())
        {
            phaser.arriveAndAwaitAdvance();
        }
        System.out.println("Phaser terminated");
    }
}
