/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter10;

/**
 *
 * @author macbook
 */
public class ChainExcepDemo {
    static void demoproc()
    {
        NullPointerException ne = new NullPointerException("top layer");
        ne.initCause(new ArithmeticException("cause"));
        throw ne;
    }
    public static void main(String[] args) {
        try
        {
            demoproc();
        }
        catch(NullPointerException ne)
        {
            ne.printStackTrace();
            System.out.println("ne getCause "+ne.getCause().getMessage());
        }
    }
}
