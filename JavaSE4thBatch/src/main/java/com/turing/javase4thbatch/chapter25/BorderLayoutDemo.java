/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter25;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.Panel;

/**
 *
 * @author macbook
 */
public class BorderLayoutDemo extends ParentFrame{

    public BorderLayoutDemo() {
        super("Hello World");
        this.initUI();
    }
    public Insets getInsets()
    {
        return new Insets(10,10,20,20);
    }
    void initUI()
    {
        setLayout(new BorderLayout());
        
        Panel northPanel = new Panel();
        Button btnOk = new Button("Ok");
        Button btnCancel = new Button("Cancel");
        
        northPanel.add(btnOk);
        northPanel.add(btnCancel);
        add(northPanel,BorderLayout.NORTH);
        
        Panel centerPanel = new Panel();
        for (int i = 0; i < 10; i++) {
            Button btn = new Button(i+"");
            centerPanel.add(btn);
        }
        add(centerPanel,BorderLayout.CENTER);
        
         Panel southPanel = new Panel();
         southPanel.add(new Button("South"));
         
         add(southPanel,BorderLayout.SOUTH);
         
         Panel eastPanel = new Panel();
         eastPanel.add(new Button("East"));
         
         add(eastPanel,BorderLayout.EAST);
         
         Panel westPanel = new Panel();
         westPanel.add(new Button("West"));
         
         add(westPanel,BorderLayout.WEST);
    }
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
