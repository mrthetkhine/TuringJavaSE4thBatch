/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class TernaryOp {
    public static void main(String[] args) {
        int num = 10;
        
        String evenOrOdd = (num % 2 ==0)?"Even":"Odd";
        System.out.println("EvenOrOdd "+evenOrOdd);
        
        if(num % 2== 0)
        {
            evenOrOdd = "Even";
        }
        else
        {
            evenOrOdd = "Odd";
        }
        int mark = 45;
        String result = mark >= 40 ?
                                    (mark >=80)?"Distinction":"Pass"
                                    :"Fail";
        System.out.println("Result "+result);
    }
}
