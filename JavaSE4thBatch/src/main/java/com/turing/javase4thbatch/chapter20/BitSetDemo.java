/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter20;

import java.util.Arrays;
import java.util.BitSet;

/**
 *
 * @author macbook
 */
public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet(16);
        bitSet.set(1);
        
        BitSet bitSet2 = new BitSet(16);
        bitSet2.set(0);
        bitSet2.set(1);
        
        bitSet.and(bitSet2);
        
        Arrays.stream(bitSet.toLongArray()).forEach(System.out::println);
    }
}
