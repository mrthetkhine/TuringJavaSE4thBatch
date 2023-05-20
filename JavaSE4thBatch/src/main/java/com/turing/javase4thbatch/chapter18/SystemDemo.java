/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class SystemDemo {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int arr2[] = new int[5];
        System.arraycopy(arr, 1, arr2, 0, 3);
        
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Arr2 "+arr2[i]);
        }
        
        System.out.println("GetProperty "+ System.getProperty("user.home"));
        System.out.println("JavaHome "+ System.getProperty("java.home"));
        
    }
}
