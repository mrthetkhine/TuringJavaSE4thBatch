/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author macbook
 */
class Sum extends RecursiveTask<Double>
{
    final int treshold = 500;
    double [] data;
    int start,end;
    
    Sum(double[]data,int start, int end)
    {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Double compute() {
        double sum = 0;
        if( (end-start) < treshold)
        {
            for (int i = start; i < end; i++) {
                sum+= data[i];
            }
        }
        else
        {
            int middle = (start+end)/2;
            Sum subtaskA = new Sum(data,start,middle);
            Sum subtaskB = new Sum(data,middle+1,end);
            
            subtaskA.fork();
            subtaskB.fork();
            
            sum = subtaskA.join()+subtaskB.join();
            System.out.println("Middle return "+middle +" Sum "+sum);
        }
        return sum;
    }
}
public class RecursiveTaskDemo {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();
        
        double []numbers = new double[10000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        Sum sqrt = new Sum(numbers, 0, numbers.length);
        double result;
        result = fjp.invoke(sqrt);
        
        
        System.out.println("Result "+result);
    }
}
