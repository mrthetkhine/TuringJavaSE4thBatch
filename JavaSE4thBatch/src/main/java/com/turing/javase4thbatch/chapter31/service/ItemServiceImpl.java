/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase4thbatch.chapter31.service;

import com.turing.javase4thbatch.chapter31.dao.ItemDAO;
import com.turing.javase4thbatch.chapter31.dao.ItemDAOImpl;
import com.turing.javase4thbatch.chapter31.model.Item;
import java.util.List;

/**
 *
 * @author macbook
 */
public class ItemServiceImpl implements ItemService{

    ItemDAO itemDao ;

    public ItemServiceImpl() {
        this.itemDao = new ItemDAOImpl();
    }
    
    @Override
    public void addItem(Item item) {
        this.itemDao.addItem(item);
        
    }

    @Override
    public List<Item> getAllItem() {
        return this.itemDao.getAllItem();
    }
    
}
