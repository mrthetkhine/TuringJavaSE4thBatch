/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter7;

/**
 *
 * @author macbook
 */
class Base
{
    final void method()
    {
        System.out.println("Cannot override");
    }
}
class Child extends Base
{
    /*
    void method()
    {
        System.out.println("Cannot override");
    }
    */
}
final class FinalClass
{
    
}
/*
class AnotherChild extends FinalClass
{
}
*/
public class FinalUsage {
    public static void main(String[] args) {
        final double PI = 3.14;
        //PI = 2;
    }
}
