/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter25;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


/**
 *
 * @author macbook
 */
public class CheckBoxDemo extends ParentFrame implements ItemListener{

    Checkbox window, android, mac;
    CheckboxGroup cbg;
    Button btnOk;
    public CheckBoxDemo() {
        super("CheckboDemo");
        this.initUI();
    }
    public void initUI()
    {
         setLayout(new FlowLayout());
         
         cbg = new CheckboxGroup();
         window = new Checkbox("Window ",cbg,true);
         android = new Checkbox("Android",cbg,false);
         mac = new Checkbox("Mac",cbg,false);
         
         window.addItemListener(this);
         android.addItemListener(this);
         mac.addItemListener(this);
         
         add(window);
         add(android);
         add(mac);
         
        btnOk = new Button("Ok");
        btnOk.addActionListener(ae->{
            /*
            System.out.println("Window "+window.getState());
            System.out.println("Android "+android.getState());
            System.out.println("Mac "+ mac.getState());
            */
            Checkbox selected = this.cbg.getSelectedCheckbox();
            System.out.println("Label "+selected.getLabel());
        });
        add(btnOk);
        
        
         
    }
    public static void main(String[] args) {
        new CheckBoxDemo();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println("Event "+e.getItem());
        System.out.println("State "+e.getSource());
    }
    
}
