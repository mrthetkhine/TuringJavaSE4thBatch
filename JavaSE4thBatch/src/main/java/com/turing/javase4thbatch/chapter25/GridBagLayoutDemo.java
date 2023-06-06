/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter25;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

/**
 *
 * @author macbook
 */
public class GridBagLayoutDemo extends ParentFrame{
    GridBagLayoutDemo()
    {
        super("Grid layout");
        this.initUI();
    }
    public void initUI()
    {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        
        setLayout(gbl);
        
        Checkbox window = new Checkbox("window");
        gbc.weightx = 1;
        gbc.ipadx = 200;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        
        gbl.setConstraints(window, gbc);
        add(window);
        
        Button solaris = new Button("solaris");
        gbc.weighty = 1.0;
        gbc.gridwidth  = GridBagConstraints.RELATIVE;
        
        gbl.setConstraints(solaris, gbc);
        add(solaris);
    }
    public static void main(String[] args) {
        new GridBagLayoutDemo();
    }
}
