/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter9;

/**
 *
 * @author macbook
 */
interface JobLevel
{
    int ASSISTANT_MANAGER = 1;
    int MANAGER  = 2;
}
public class Constant {
    public static void main(String[] args) {
        int level = JobLevel.ASSISTANT_MANAGER;
        //JobLevel.ASSISTANT_MANAGER = 3;
    }
}
