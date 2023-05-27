/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter20;

import java.util.Random;

/**
 *
 * @author macbook
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println("Random "+ (r.nextInt(10)+1));
        }
        System.out.println("Random Float "+r.nextFloat());
    }
}
