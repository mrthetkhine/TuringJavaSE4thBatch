/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class ArrayDemo {
    public static void main(String[] args) {
        
        int[] ages = {23,34,20,30,40};
        
        System.out.println("Ages[0] "+ages[0]);
        System.out.println("Ages[4] "+ages[4]);
        System.out.println("Ages.length "+ages.length);
        
        //System.out.println("Aage[-1] "+ages[-1]);
        
        int[] daysInMonth ={31,28,31,30,31,30,31,31,30,31,30,31};
        String[] monthsName = {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
        int month = 8;
        
        System.out.println("Month name "+ monthsName[month-1]);
        System.out.println("Month day "+ daysInMonth[month-1]);
        
        ages[0]++;
        System.out.println("Ages[0] "+ages[0]);
    }
}
