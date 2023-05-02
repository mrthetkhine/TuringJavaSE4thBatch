/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class Sum implements Callable<Integer>
{
    int stop;
    Sum(int v)
    {
        stop = v;
    }
    @Override
    public Integer call() throws Exception {
        Integer result = 0;
        
        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        for (int i = 0; i < stop; i++) {
            result += i;
        }
        return result;
    }
}
public class CallableDemo {
    public static void main(String[] args) throws TimeoutException {
        try {
            ExecutorService es = Executors.newFixedThreadPool(3);
            Future<Integer> sumResult ;
            
            System.out.println("Submit");
            sumResult = es.submit(new Sum(20));
            System.out.println("Get "+sumResult.get(20,TimeUnit.MILLISECONDS));
            System.out.println("Another line");
           
            
            es.shutdown();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (ExecutionException ex) {
            ex.printStackTrace();
        }
    }
}
