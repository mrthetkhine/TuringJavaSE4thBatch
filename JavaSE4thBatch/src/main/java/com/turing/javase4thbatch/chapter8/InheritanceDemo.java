/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter8;

/**
 *
 * @author macbook
 */
class Window
{
    void screenSaver()
    {
        System.out.println("window95 screen saver");
    }
    void microsoftWord()
    {
        System.out.println("MS Word");
    }
    void excel()
    {
        System.out.println("Excel");
    }
}
class Window98 extends Window
{
    void excel()
    {
        super.excel();
        System.out.println("Added aditional behaviour");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Window window = new Window98();
        window.screenSaver();
        window.excel();
    }
}
