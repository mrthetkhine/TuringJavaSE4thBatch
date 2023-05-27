/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter20;
import java.util.TimeZone;
/**
 *
 * @author macbook
 */
public class TimeZoneDemo {
    public static void main(String[] args) {
        for(String zone : TimeZone.getAvailableIDs())
        {
            System.out.println("Zone "+zone);
        }
        TimeZone zone = TimeZone.getDefault();
        System.out.println("Default "+zone);
        System.out.println("ID "+zone.getID());
    }
}
