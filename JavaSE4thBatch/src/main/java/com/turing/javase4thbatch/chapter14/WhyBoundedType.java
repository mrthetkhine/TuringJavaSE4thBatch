/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter14;

/**
 *
 * @author macbook
 */
class Stats<T extends Number>{
    T[]nums;
    
    Stats(T[] arr)
    {
        nums = arr;
    }
    double average()
    {
        double result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[0].doubleValue();
        }
        return result/nums.length;
    }
    boolean sameAverage(Stats<?> another)
    {
        if(average() == another.average())
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
public class WhyBoundedType {
    public static void main(String[] args) {
        Float[] fArr = {10f,20f,30f};
        Stats<Float> floatStat;
        floatStat = new Stats<Float>(fArr);
        
        double result = floatStat.average();   
        System.out.println("Result "+result);
        
        Integer[] iArr = {10,20,30};
        Stats<Integer> iStat = new Stats<>(iArr);
        
        System.out.println("Same "+ floatStat.sameAverage(iStat));
        
     
    }
}
