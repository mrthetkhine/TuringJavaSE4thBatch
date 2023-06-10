/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter31.dao;

import com.turing.javase4thbatch.chapter31.model.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class ItemDAOImpl implements ItemDAO{

    List<Item> items = new ArrayList<Item>();
    @Override
    public List<Item> getAllItem() {
        return this.items;
    }

    @Override
    public void addItem(Item item) {
        this.items.add(item);
    }
    
}
