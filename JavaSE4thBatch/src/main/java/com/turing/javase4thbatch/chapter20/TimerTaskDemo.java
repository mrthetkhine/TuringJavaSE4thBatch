/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter20;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author macbook
 */
class MyTimerTask extends TimerTask
{

    @Override
    public void run() {
        Date date = new Date();
        System.out.println("Timer task executed "+date.toString());
    }
    
}
public class TimerTaskDemo {
    public static void main(String[] args) {
        MyTimerTask task = new MyTimerTask();
        Timer timer = new Timer();
        timer.schedule(task, 1000,500);
        
        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
