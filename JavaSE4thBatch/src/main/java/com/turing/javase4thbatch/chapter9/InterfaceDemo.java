/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter9;

/**
 *
 * @author macbook
 */
interface Flyable
{
    void fly();
    default String getString()
    {
        internal();
        return "Flyable";
    }
    private void internal()
    {
        System.out.println("Internal");
    }
    static double min(double a, double b)
    {
        return Math.min(a, b);
    }
    
}
interface Walkable
{
    void walk();
}
interface DuckLikeBehaviour extends Flyable,Walkable
{
    void swim();
}
class Aeroplane implements Flyable
{

    @Override
    public void fly() {
        System.out.println("Aeroplane fly");
    }
}
class Bird implements Flyable
{
    @Override
    public void fly() {
        System.out.println("Bird fly");
    }
}
class Duck implements Flyable,Walkable
{
    @Override
    public void fly() {
        System.out.println("Duck fly");
    }
    @Override
    public void walk() {
        System.out.println("Duck Walk");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Flyable flyable = new Aeroplane();
        flyable.fly();
        
        flyable = new Bird();
        flyable.fly();
        System.out.println(flyable.getString());
    }
}
