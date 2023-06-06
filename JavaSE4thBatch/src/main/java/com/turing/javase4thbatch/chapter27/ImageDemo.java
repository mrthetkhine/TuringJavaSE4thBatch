/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter27;

import com.turing.javase4thbatch.chapter25.ParentFrame;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author macbook
 */
public class ImageDemo extends ParentFrame{
    Image image;
    ImageDemo()
    {
        super("Image Demo");
        this.initUI();
    }
    public void initUI()
    {
        File imgFile = new File("images/orange.jpeg");
        System.out.println("Path "+imgFile.getAbsolutePath());
        try
        {
            image = ImageIO.read(imgFile);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void paint(Graphics g)
    {
        g.drawImage(image, 100, 100, this);
    }
    
    public static void main(String[] args) {
        new ImageDemo();
    }
}
