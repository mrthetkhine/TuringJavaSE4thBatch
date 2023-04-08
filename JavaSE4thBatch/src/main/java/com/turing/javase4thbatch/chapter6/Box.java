/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class Box {
    double width,height,depth;
    
    Box(double width,double height,double depth)
    {
        System.out.println("Box constructor");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume()
    {
        System.out.println("Compute volume");
        System.out.println("Volume is "+ (width*height*depth));
        return width*height*depth;
    }
    
    void increase(int factor)
    {
        System.out.println("Factor "+factor);
        this.width *= 2;
        this.height *= 2;
        this.depth *= 2;
    }
    
    public static void main(String[] args) {
        
        //new Box();
        Box box = new Box(1,3,4);
        double volume= box.volume();
        
        System.out.println("Volume "+volume);
        
        box.increase(2);
        volume= box.volume();
        
        System.out.println("Volume "+volume);
    }
    
}
