/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

/**
 *
 * @author macbook
 */
public class PerformanceDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        Random random = new Random();
        for (int i = 0; i < 100000000; i++) {
            list.add(random.nextInt(50000));
        }
        
        double start = System.currentTimeMillis();
        Optional<Integer> max = list
                                    .stream()
                                    //.parallelStream()
                                    //.parallel()
                                    .max(Integer::compare);
        double end = System.currentTimeMillis();
        double time = (end-start);
        System.out.println("Time "+time);
    }
}
