/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter25;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextArea;

/**
 *
 * @author macbook
 */
public class TextAreaDemo extends ParentFrame{

    public TextAreaDemo() {
        super("TextArea");
        this.initUI();
    }
    public void initUI()
    {
        setLayout(new FlowLayout());
        Label lblAddress = new Label("Address");
        add(lblAddress);
        
        TextArea txtArea = new TextArea(5, 20);
        add(txtArea);
    }
    public static void main(String[] args) {
        new TextAreaDemo();
    }
    
}
