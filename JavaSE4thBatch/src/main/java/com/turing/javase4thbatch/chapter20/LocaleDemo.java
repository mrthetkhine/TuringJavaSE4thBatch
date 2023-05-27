/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter20;

import java.util.Currency;
import java.util.Locale;

/**
 *
 * @author macbook
 */
public class LocaleDemo {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("Default "+locale);
        System.out.println("Country "+locale.getCountry());
        
        Currency currency = Currency.getInstance(Locale.getDefault());
        System.out.println("Currency "+currency);
    }
}
