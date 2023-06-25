/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter31.model;

/**
 *
 * @author macbook
 */
public class ShoppingCartItem extends Item{

    public ShoppingCartItem()
    {
    }
    public ShoppingCartItem(String name, double price, double quantity) {
        super(name, price, quantity);
      
    }

    public double getTotal() {
        return this.price* this.quantity;
    }    
    
}
