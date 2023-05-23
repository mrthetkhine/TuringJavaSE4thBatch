/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter19;

import java.util.Arrays;

/**
 *
 * @author macbook
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int []arr = {1,3,4,15,11,20,30};
        
        int index = Arrays.binarySearch(arr, 20);
        System.out.println("Index "+index);
        
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        
        System.out.println("Equals "+Arrays.equals(arr, arr2));
        
        Arrays.fill(arr2, -3);
        System.out.println("Fill");
        /*
        for(int i : arr2)
        {
            System.out.println("Item "+i);
        }*/
        Arrays.stream(arr2).forEach(System.out::println);
    }
}
