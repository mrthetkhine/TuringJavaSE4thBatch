/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter7;

/**
 *
 * @author macbook
 */
class Parent
{
    private int privateData;
    protected int parentData;
    int data;
}
public class AccessControl extends Parent{

    public AccessControl() {
        parentData = 200;
    }
    
}
