/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter26;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author macbook
 */

class ButtonClickListener implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action name "+e.getActionCommand());
    }
}
public class SimpleFrame extends Frame implements ActionListener{

    public SimpleFrame() {
        super("Hello World");
        this.init();
        
    }
    void init()
    {
        setSize(400,500);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we)
            {
                System.out.println("Close button click");
                System.exit(0);
            }
        });
        this.addUIComponent();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action name "+e.getActionCommand());
    }
    public void addUIComponent()
    {
        Panel panel = new Panel();
        
        Label label = new Label("UI Control");
        panel.add(label);
        
        Button button = new Button("Click me");
        /*
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        });
        */
        //button.addActionListener(new ButtonClickListener());
        button.addActionListener(this);
        panel.add(button);
         
        Button btnCancel = new Button("Cancel");
        //btnCancel.addActionListener(new ButtonClickListener());
        //btnCancel.addActionListener(this);
        btnCancel.addActionListener((ae)->{
            System.out.println("Cancel click");
        });
        
       
        panel.add(btnCancel);
        
        add(panel);
    }
            
    public static void main(String[] args) {
        new SimpleFrame();
    }
    
    
}
