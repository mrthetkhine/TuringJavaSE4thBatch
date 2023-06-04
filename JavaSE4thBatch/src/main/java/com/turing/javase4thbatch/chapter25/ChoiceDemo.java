/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter25;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author macbook
 */
public class ChoiceDemo extends ParentFrame implements ItemListener{

    Choice os ;
    public ChoiceDemo() {
        super("Choice"); this.initUI();
    }
    public void initUI()
    {
        setLayout(new FlowLayout());
        
        Label lblOS = new Label("OS");
        add(lblOS);
        
        os = new Choice();
        os.add("Window");
        os.add("Linux");
        os.add("Mac");
        
        os.addItemListener(this);
        add(os);
        
        
    }
    public static void main(String[] args) {
        new ChoiceDemo();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println("Item change "+e.getItem());
    }
    
}
