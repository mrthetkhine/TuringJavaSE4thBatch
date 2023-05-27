/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter20;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author macbook
 */
public class BundleDemo {
    public static void main(String[] args) {
        
        ResourceBundle bundle = ResourceBundle.getBundle("com.turing.javase4thbatch.chapter20.SampleRB",Locale.ENGLISH);
        System.out.println("Title "+bundle.getString("Title"));
        
        bundle = ResourceBundle.getBundle("com.turing.javase4thbatch.chapter20.SampleRB",Locale.GERMAN);
        System.out.println("Title "+bundle.getString("Title"));
    }
}
