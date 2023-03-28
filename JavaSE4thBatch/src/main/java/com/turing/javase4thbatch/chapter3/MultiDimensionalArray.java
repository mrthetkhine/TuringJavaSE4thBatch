/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4,5 },
            {6,7,8,9,10,11,12 },
        };
        int[] row0 = matrix[0];
        System.out.println("martix [0][1] "+row0[1]);
        System.out.println("martix [0][4] "+matrix[0][4]);
    }
}
