/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter15;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
interface DoubleNumericArrayFunc
{
    double func(double[]arr)throws EmptyArrayException;
}
class EmptyArrayException extends Exception
{

    public EmptyArrayException() {
        super("Empty array exception");
    }
    
}
public class ExceptionDemo {
    public static void main(String[] args) {
        double values[] = {1.0f, 2.0, 3.0}; 
        DoubleNumericArrayFunc doubleArr = (arr)->{
           double sum = 0;
           if(arr.length == 0)
           {
               throw new EmptyArrayException();
           }
           else
           {
               for (int i = 0; i < arr.length; i++) {
                   sum += arr[i];
               }
           }
           return sum;
        };
        try {
            System.out.println("DoubleArr "+doubleArr.func(values));
        } catch (EmptyArrayException ex) {
            ex.printStackTrace();
        }
    }
   
}
