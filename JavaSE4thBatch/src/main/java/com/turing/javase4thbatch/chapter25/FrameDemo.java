/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter25;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
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
        addMouseListener(new MouseAdapter(){
              @Override  
              public void mouseClicked(MouseEvent e) {
                  System.out.println("Mouse click "+ e.getX() + ", "+e.getY());
              }
              /*
               public void mousePressed(MouseEvent e) {
                    System.out.println("Mouse press "+ e.getX() + ", "+e.getY());
               }
                public void mouseReleased(MouseEvent e) {
                     System.out.println("mouseReleased  "+ e.getX() + ", "+e.getY());
                }

   
                public void mouseEntered(MouseEvent e) {
                    System.out.println("mouseEntered  "+ e.getX() + ", "+e.getY());
                }


                public void mouseExited(MouseEvent e) {
                     System.out.println("mouseExited  "+ e.getX() + ", "+e.getY());
                }

                public void mouseWheelMoved(MouseWheelEvent e){}


                public void mouseDragged(MouseEvent e){}

                public void mouseMoved(MouseEvent e){
                    System.out.println("mouseMoved  "+ e.getX() + ", "+e.getY());
                }*/
                    });
        Font[]fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
        for (Font font : fonts) {
            System.out.println("Font "+font.getFontName());
        }
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
        g.setFont(new Font("Georgia",Font.PLAIN,14));
        g.drawString("Hello World", 200, 100);
    }
    public static void main(String[] args) {
        new FrameDemo();
    }
}
