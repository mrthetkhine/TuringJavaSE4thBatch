/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter14;

/**
 *
 * @author macbook
 */
public class Pair<T,U> {
    
    T first;
    U second;
    
    Pair(T first, U second)
    {
        this.first = first;
        this.second = second;
    }
    T getFirst()
    {
        return this.first;
    }
    U getSecond()
    {
        return this.second;
    }
    
    public static void main(String[] args) {
        Pair<Integer,String> iStrPair = new Pair<>(1,"Hello");
        
        System.out.println("First "+ iStrPair.getFirst()+ " second "+iStrPair.getSecond());
        
        Pair<String,Boolean> another = new Pair<>("done",false);
        System.out.println("First "+another.getFirst()+" another "+another.getSecond());
        
        //Pair<String,int> another = new Pair<>("done",1);
    }
}
