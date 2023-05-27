/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter20;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author macbook
 */
public class GregorianCalendarDemo {
    public static void main(String[] args) {
        String[] months = {"Jan","Feb","Mar",
                        "April","May","June"
                        ,"July","Aug","Sep"
                        ,"Oct","Nov","Dec"};
        GregorianCalendar calendar ;//= new GregorianCalendar(2023,4,26);
        calendar = new GregorianCalendar();
        System.out.println("Get Month "+ months[calendar.get(Calendar.MONTH)]);
        System.out.println("Get Date "+ calendar.get(Calendar.DATE));
        System.out.println("Get Day "+ calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Calendar "+calendar);
        
    }
}
