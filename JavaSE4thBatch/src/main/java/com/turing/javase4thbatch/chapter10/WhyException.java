/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter10;

/**
 *
 * @author macbook
 */
public class WhyException {
    static double div(double a , double b)
    {
        if( Double.isNaN(a) || Double.isNaN(b))
        {
            throw new RuntimeException("One of the operand is NaN");
        }
        return a/b;
    }
    public static void main(String[] args) {
        
        /*
        try
        {
            //double result = div(10,Double.NaN);
            double result = div(10,2);
            System.out.println("Result "+result);
        }
        catch(Exception e)
        {
            System.out.println("E "+e.getMessage());
        }
        finally
        {
            System.out.println("Finally always executed");
        }
        */
        double result = div(10,Double.NaN);
        System.out.println("Result "+result);
        System.out.println("End of line");
    }
}
