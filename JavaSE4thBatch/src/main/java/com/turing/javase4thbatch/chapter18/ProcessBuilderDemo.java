/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class ProcessBuilderDemo {
    public static void main(String[] args) {
        try {
            ProcessBuilder builder = new ProcessBuilder("mkdir","hello3");
            builder.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
