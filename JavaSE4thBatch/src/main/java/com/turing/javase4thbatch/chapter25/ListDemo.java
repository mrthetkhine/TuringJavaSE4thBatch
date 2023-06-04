/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter25;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author macbook
 */
public class ListDemo extends ParentFrame implements ItemListener{

    List os ;
    Button btnOk;
    public ListDemo() {
        super("List"); this.initUI();
    }
    public void initUI()
    {
        setLayout(new FlowLayout());
        
        Label lblOS = new Label("OS");
        add(lblOS);
        
        
        os = new List();
        os.add("Window");
        os.add("Linux");
        os.add("Mac");
        
        os.setMultipleMode(true);
        for (int i = 0; i < 10; i++) {
            os.add((i+1)+"");
        }
        
        os.addItemListener(this);
        add(os);
        
        btnOk = new Button("Ok");
        btnOk.addActionListener(ae->{
            String[] items = this.os.getSelectedItems();
            for (String item : items) {
                System.out.println("Item selected "+item);
            }
        });
        
        add(btnOk);
        
    }
    public static void main(String[] args) {
        new ListDemo();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println("Item change "+e.getItem());
    }
    
}
