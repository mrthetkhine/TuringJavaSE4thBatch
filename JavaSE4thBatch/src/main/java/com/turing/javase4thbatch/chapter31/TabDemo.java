/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter31;

import com.turing.javase4thbatch.chapter25.ParentFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author macbook
 */
public class TabDemo extends ParentFrame{
    JTabbedPane tabPane;
    TabDemo()
    {
        super("Tab Demo");
        this.initUI();
    }
    void initUI()
    {
        this.tabPane = new JTabbedPane();
        add(this.tabPane);
        
        JPanel panelOne = new JPanel();
        panelOne.add(new JButton("One"));
        
        this.tabPane.add("Panel 1", panelOne);
        
        JPanel panelTwo = new JPanel();
        panelTwo.add(new JButton("Two"));
        
        this.tabPane.add("Panel 2", panelTwo);
    }
    public static void main(String[] args) {
        new TabDemo();
    }
}
