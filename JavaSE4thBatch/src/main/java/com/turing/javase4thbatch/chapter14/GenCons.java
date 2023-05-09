/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter14;

/**
 *
 * @author macbook
 */
public class GenCons {
    double value;
    <T extends Number> GenCons(T value)
    {
        this.value = value.doubleValue();
    }
    void showValue()
    {
        System.out.println("Value "+value);
    }
    public static void main(String[] args) {
        GenCons gen = new GenCons(4);
        gen.showValue();
    }
}
