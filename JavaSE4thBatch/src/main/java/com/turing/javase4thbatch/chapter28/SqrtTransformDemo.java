/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 *
 * @author macbook
 */
class SqrtTransform extends RecursiveAction
{

    final int sqrtThreshold = 1000;
    double[]data;
    int start, end;

    public SqrtTransform(double[]vals,int start, int end) {
        this.data = vals;
        this.start = start;
        this.end = end;
    }
    
    @Override
    protected void compute() {
     
        if((end-start) < sqrtThreshold)
        {
            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        }
        else
        {
            int middle = (start+end) /2;
            System.out.println("Spawn subtask middle "+middle);
            invokeAll(new SqrtTransform(data, start, middle),
                        new SqrtTransform(data, middle+1, end));
        }
    }
    
}
public class SqrtTransformDemo {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();
        
        double []numbers = new double[10000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        SqrtTransform sqrt = new SqrtTransform(numbers, 0, numbers.length);
        fjp.invoke(sqrt);
        //fjp.execute(sqrt);
         
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Numers "+numbers[i]);
        }
    }
}
