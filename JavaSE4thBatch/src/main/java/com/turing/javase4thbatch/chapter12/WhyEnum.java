/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter12;



/**
 *
 * @author macbook
 */
enum Gender {
    Male,
    Female;
}
public class WhyEnum {
    public static void main(String[] args) {
       Gender gender = Gender.Female;
     
       //gender = 12;
       System.out.println("Gender "+gender);
       
       if( gender == Gender.Female)
       {
           System.out.println("It is female");
       }
       
       for(Gender g : Gender.values())
       {
           System.out.println("G "+g);
       }
       gender = Gender.valueOf("Male");
       System.out.println("Gender "+gender);
    }
}
