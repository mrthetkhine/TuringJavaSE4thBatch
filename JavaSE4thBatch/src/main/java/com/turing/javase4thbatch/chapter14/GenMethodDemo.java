/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter14;

/**
 *
 * @author macbook
 */
public class GenMethodDemo {
    static<T extends Comparable<T>,V extends T> boolean isIn(T x, V[]y)
    {
        for (int i = 0; i < y.length; i++) {
            if(x.equals(y[i]))
                return true;
            
        }
        return false;
    }
    public static void main(String[] args) {
        Integer nums []= {1,2,3,4,5};
        System.out.println("5 in nums "+ GenMethodDemo.isIn(5, nums));
    }
}
