/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter25;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author macbook
 */
public class ParentFrame extends Frame{
    
    public ParentFrame(String title)
    {
        super(title);
        this.initWindow();
    }
    void initWindow()
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
       
    }
    
}
