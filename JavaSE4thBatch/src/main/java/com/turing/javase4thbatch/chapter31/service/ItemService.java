/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase4thbatch.chapter31.service;

import com.turing.javase4thbatch.chapter31.model.Item;
import com.turing.javase4thbatch.chapter31.model.ShoppingCart;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author macbook
 */
public interface ItemService {
    List<Item> getAllItem();
    void addItem(Item item);
    Optional<Item> getItemByName(String name);
    boolean isQuantitySufficientForItem(Item item,int quantity);
    void checkOut(ShoppingCart cart);
}
