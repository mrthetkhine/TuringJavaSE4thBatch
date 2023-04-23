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
    static double div(double a , double b) throws Exception
    {
        if( Double.isNaN(a) || Double.isNaN(b))
        {
            throw new Exception("One of the operand is NaN");
        }
        return a/b;
    }
    public static void main(String[] args) {
        
        try
        {
            double result = div(10,3);
            System.out.println("Result "+result);
        }
        catch(Exception e)
        {
            System.out.println("E "+e.getMessage());
        }
    }
}
