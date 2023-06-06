/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter25;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 *
 * @author macbook
 */
class SimpleDialogBox extends Dialog
{
    SimpleDialogBox(Frame parent, String title)
    {
        super(parent,"Dialog title");
        setLayout(new FlowLayout());
        setSize(300,200);
        Button ok = new Button("Ok");
        
        add(ok);
        
        Button cancel = new Button("Cancel");
        
        add(cancel);
        cancel.addActionListener((ae)-> dispose());
    }
}
public class DialogBoxDemo extends ParentFrame{
    SimpleDialogBox simpleDialogBox;
    DialogBoxDemo()
    {
        super("DialogBox");
        this.initUI();
    }
    void initUI()
    {
        setLayout(new FlowLayout());
        simpleDialogBox = new SimpleDialogBox(this,"Dialog Demo");
        
        Button btnShow = new Button("Show");
        btnShow.addActionListener(ae-> simpleDialogBox.setVisible(true));
        
        add(btnShow);
    }
    public static void main(String[] args) {
        new DialogBoxDemo();
    }
}
