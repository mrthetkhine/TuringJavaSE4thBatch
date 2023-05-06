/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter12;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        //list.add(12);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
    }
}
