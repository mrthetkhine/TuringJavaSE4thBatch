/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter25;

import java.awt.Button;
import java.awt.FlowLayout;

/**
 *
 * @author macbook
 */
public class FlowLayoutDemo extends ParentFrame{

    public FlowLayoutDemo() {
        super("Hello World");
        this.initUI();
    }
    void initUI()
    {
        setLayout(new FlowLayout());
        
        Button btnOk = new Button("Ok");
        Button btnCancel = new Button("Cancel");
        
        add(btnOk);
        add(btnCancel);
        for (int i = 0; i < 10; i++) {
            Button btn = new Button(i+"");
            add(btn);
        }
    }
    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
