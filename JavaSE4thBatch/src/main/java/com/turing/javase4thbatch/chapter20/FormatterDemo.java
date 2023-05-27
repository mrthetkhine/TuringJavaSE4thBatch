/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;

/**
 *
 * @author macbook
 */
public class FormatterDemo {
    public static void main(String[] args) {
        
        
        Formatter fmt = new Formatter();
        String data = fmt.format("Formatting %s is easy=>%4d %.2f", "with Java", 10, 98.64442).toString();
        System.out.println("Result "+data);
        
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd E");
        String text = date.format(formatter);
        System.out.println("Date "+text);
        LocalDate parsedDate = LocalDate.parse(text, formatter);
        System.out.println("parsedate "+parsedDate);
    }
}
