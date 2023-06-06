/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter25;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

/**
 *
 * @author macbook
 */
public class GridLayoutDemo extends ParentFrame{
    GridLayoutDemo()
    {
        super("Grid layout");
        this.initUI();
        this.initMenu();
    }
    public void initUI()
    {
        setLayout(new GridLayout(4,3,10,20));
        for (int i = 0; i < 12; i++) {
            add(new Button(i+""));
        }
    }
    public void initMenu()
    {
        MenuBar menuBar = new MenuBar();
        
        Menu mnuFile = new Menu("File");
        MenuItem mnuNewProject = new MenuItem("New Project");
        MenuItem mnuNewFile = new MenuItem("New File");
        mnuFile.add(mnuNewProject);
        mnuFile.add(mnuNewFile);
        
        mnuFile.addSeparator();
        
        Menu mnuChild = new Menu("Child");
        mnuChild.add(new MenuItem("Child Menu"));
        mnuFile.add(mnuChild);
        
        menuBar.add(mnuFile);
        setMenuBar(menuBar);
        
        
        mnuNewProject.addActionListener((ae)->{
            System.out.println("Add New Project");
        });
    }
    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
