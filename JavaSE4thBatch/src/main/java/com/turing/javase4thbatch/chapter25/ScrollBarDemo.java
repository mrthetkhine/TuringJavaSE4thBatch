/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter25;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.TextField;

/**
 *
 * @author macbook
 */
public class ScrollBarDemo extends ParentFrame{
    Scrollbar horizontal, vertical;
    ScrollBarDemo()
    {
        super("ScrollBar");
        this.initUI();
    }
    public void initUI()
    {
        setLayout(new FlowLayout());
        Label lblName = new Label("Name");
        TextField txtName = new TextField(100);
        
        add(lblName);
        add(txtName);
        
        Button btnOk = new Button("Ok");
        btnOk.addActionListener(ae->{
            System.out.println("Get Name "+ txtName.getText());
        });
        add(btnOk);
        
        
        
        vertical = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 200);
        vertical.setPreferredSize(new Dimension(50, 100));
        
        add(vertical);
        vertical.addAdjustmentListener(ae->{
            System.out.println("Vertical "+ae.getValue());
        });
        horizontal = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 100);
        horizontal.setPreferredSize(new Dimension(100, 50));
        
        horizontal.addAdjustmentListener(ae->{
            System.out.println("Horizontal "+ae.getValue());
        });
        add(horizontal);
    }
    public static void main(String[] args) {
        new ScrollBarDemo();
    }
}
