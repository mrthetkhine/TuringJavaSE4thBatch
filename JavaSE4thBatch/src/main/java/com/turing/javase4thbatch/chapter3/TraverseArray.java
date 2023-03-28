/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class TraverseArray {
    public static void main(String[] args) {
        int[]arr = {10,20,30,40,50};
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr "+arr[i]);
        }
        
         int[][] matrix = {
            {1,2,3,4,5 },
            {6,7,8,9,10,11,12 },
        };
         for (int row = 0; row < matrix.length; row++) {
             for (int col = 0; col < matrix[row].length; col++) {
                  System.out.println("Matrix ["+row+"]["+col+"]="+matrix[row][col]);
             }
        }
    }
}
