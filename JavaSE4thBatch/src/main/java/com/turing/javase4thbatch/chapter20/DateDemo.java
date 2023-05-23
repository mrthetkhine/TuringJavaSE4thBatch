/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter20;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author macbook
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        
        long milisecond = date.getTime();
        Date date2 = new Date(milisecond);
        System.out.println("Date "+date2);
        
        Date date3 = new Date();
        System.out.println("After "+ date3.after(date));
        
        Calendar cal = Calendar.getInstance();
        System.out.println("Hour "+ cal.get(Calendar.HOUR));
        System.out.println("Minute "+ cal.get(Calendar.MINUTE));
    }
}
