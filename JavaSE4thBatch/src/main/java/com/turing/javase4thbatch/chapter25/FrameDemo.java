/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter25;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author macbook
 */
public class FrameDemo extends Frame{
    
    FrameDemo()
    {
        super("Hello World");
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
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
    
    void drawPoint(Graphics g,int x, int y )
    {
        g.drawArc(x, y, 1, 1, 0, 360);
    }
    double degreeToRadian(int degree)
    {
        return degree * (Math.PI/180);
    }
    @Override
    public void paint(Graphics g)
    {
        System.out.println("Paint ");
        for (int i = 0; i < 360; i++) {
            int radius = (int)(50 * ( 1 + Math.sin(degreeToRadian(i))));
            int centerX = 100;
            int centerY = 100;
            int x = (int)(centerX + radius * Math.cos( degreeToRadian(i)));
            int y = (int)(centerY + radius * Math.sin( degreeToRadian(i)));
            drawPoint(g, x, y);
        }
        
    }
    public static void main(String[] args) {
        new FrameDemo();
    }
}
