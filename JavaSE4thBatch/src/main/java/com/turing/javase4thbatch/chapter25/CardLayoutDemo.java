/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter25;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Panel;

/**
 *
 * @author macbook
 */
public class CardLayoutDemo extends ParentFrame{
    Panel osCards;
    CardLayoutDemo()
    {
        super("Card layout");
        this.initUI();
    }
    public void initUI()
    {
        osCards = new Panel();
        CardLayout cardLayout1 = new CardLayout();
        osCards.setLayout(cardLayout1);
        
        Panel panelWindow = new Panel();
        panelWindow.add(new Button("Window"));
        
        Panel panelMac = new Panel();
        panelMac.add(new Button("Mac"));
        
        osCards.add(panelWindow,"window");
        osCards.add(panelMac,"mac");
        
        add(osCards);
        
        Button next = new Button("Next");
        next.addActionListener(ae->{
            cardLayout1.next(osCards);
        });
        add(next,BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}
