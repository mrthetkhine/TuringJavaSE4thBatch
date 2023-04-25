/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter10;



/**
 *
 * @author macbook
 */
public class ExceptionDemo {
     static double div(double a , double b)
    {
        try
        {
           StackTraceElement[] stackTraces = Thread.currentThread().getStackTrace();
           for(StackTraceElement tre : stackTraces)
           {
               
               System.out.println("FileName "+tre.getFileName()+" "+tre.getMethodName() + " line  no "+tre.getLineNumber());
           }
        }
        catch(Exception e)
        {
        }
        try
        {
            if( Double.isNaN(a) || Double.isNaN(b))
            {
                throw new RuntimeException("One of the operand is NaN");
            }
            return a/b;
        }
        catch(Exception e)
        {
            return 200;
            //throw new RuntimeException("Another exception");
        }
        finally
        {
            System.out.println("Finally executed");
            //return 300;
            throw new RuntimeException("Rethrow at finally");
        }
        //return a/b;
    }
    public static void main(String[] args) {
        double result = div (10,Double.NaN);
        System.out.println("Result "+result);
    }
}
