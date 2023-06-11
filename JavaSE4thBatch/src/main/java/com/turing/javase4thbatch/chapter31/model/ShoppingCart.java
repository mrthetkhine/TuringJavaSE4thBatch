/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter31.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class ShoppingCart {
    List<ShoppingCartItem> items = new ArrayList<ShoppingCartItem>();
    
    public void addItem(ShoppingCartItem item)
    {
        this.items.add(item);
    }
     public List<ShoppingCartItem> getAllItems()
     {
         return this.items;
     }
     public void removeItemByIndex(int index)
     {
         this.items.remove(index);
     }
}
