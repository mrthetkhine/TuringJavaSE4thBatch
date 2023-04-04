/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class TraverseArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr "+arr[i]);
            
            arr[i] *= 2 ;
        }
        for(final int element : arr)
        {
            System.out.println("Element "+element);
           // element *= 2;
        }
        System.out.println("Arr[0] "+arr[0]);
        
        int multi[][] = {
            {10,20,30,40,50},
            { 60,70,80,90,100}
        };
        for (int[] row: multi) {
            for(int j: row)
            {
                System.out.println("J "+j);
            }
        }
    }
}
