/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter8;

//import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author macbook
 */
abstract class Human extends Object
{
    abstract void work();
    
    void demo(double a)
    {
        System.out.println("Human demo with double");
    }
    final void finalMethod()
    {
        System.out.println("Human Final Method");
    }
}
class Teacher extends Human
{
    void work()
    {
         System.out.println("Teacher teach");
    }
    void teachTution()
    {
        System.out.println("Teach tution");
    }
    //@Override
    void demo(long a)
    {
        System.out.println("Teacher demo with long");
    }
    /*
    void finalMethod()
    {
        System.out.println("Teacher Final Method");
    }
    */
}
class Doctor extends Human
{
    @Override
    void work()
    {
        System.out.println("Doctor treat patient");
    }
    void demo(int a)
    {
        System.out.println("Doctor demo with long");
    }
}
public class SubyTypeDemo {
    public static void main(String[] args) {
        Human h = new Teacher();
        
        //h = new Human();
        h.work();
        h.demo(2L);
        h.finalMethod();
        
        h = new Doctor();
        h.work();
        
        int k = 20;
        h.demo(k);
        
        var obj = new Teacher();
        //obj = new Doctor();
        
        List<String> strList = new ArrayList<String>();
    }
}
