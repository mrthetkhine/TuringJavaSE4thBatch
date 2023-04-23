/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter8;

/**
 *
 * @author macbook
 */
class Point2D
{
    protected int x;
    protected int y;

    static
    {
        System.out.println("2D static block");
    }
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Point2D constructor");
    }
    
}
class Point3D extends Point2D
{
    protected int z;
    static{
        System.out.println("3D static block");
    }
    public Point3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
        System.out.println("3D contructor");
    }
    
    
}
public class PointDemo {
    public static void main(String[] args) {
        Point3D threeD = new Point3D(10,20,30);
        BasedDerivedDemo obj = new BasedDerivedDemo();
    }
   
}
