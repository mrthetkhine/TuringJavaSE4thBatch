/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.oop;

/**
 *
 * @author macbook
 */
class Human
{
    void walk()
    {
        System.out.println("Walk");
    }
    void eat()
    {
        System.out.println("Eat");
    }
    void sleep()
    {
        System.out.println("Sleep");
    }
    void work()
    {
        System.out.println("Human work");
    }
}
class Doctor extends Human
{
    void work()
    {
        System.out.println("Doctor treat patient");
    }
}
class Teacher extends Human
{
    void work()
    {
        System.out.println("Teacher teach student");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Human h = new Teacher();
        h.walk();
        h.work();
    }
}
