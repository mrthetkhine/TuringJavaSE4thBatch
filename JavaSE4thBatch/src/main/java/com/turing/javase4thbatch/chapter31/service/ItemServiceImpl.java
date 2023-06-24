/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase4thbatch.chapter31.service;

import com.turing.javase4thbatch.chapter31.dao.ItemDAO;
import com.turing.javase4thbatch.chapter31.dao.ItemDAOImpl;
import com.turing.javase4thbatch.chapter31.model.Item;
import com.turing.javase4thbatch.chapter31.model.ShoppingCart;
import com.turing.javase4thbatch.chapter31.model.ShoppingCartItem;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author macbook
 */
public class ItemServiceImpl implements ItemService{

    ItemDAO itemDao ;

    List<Item> items; 
    public ItemServiceImpl() {
        this.itemDao = new ItemDAOImpl();
        this.items = this.itemDao.getAllItem();
    }
    
    @Override
    public void addItem(Item item) {
        this.itemDao.addItem(item);
        
    }

    @Override
    public List<Item> getAllItem() {
        return this.itemDao.getAllItem();
    }

    @Override
    public Optional<Item> getItemByName(String name) {
        List<Item> items =  this.getAllItem()
                .stream()
                .filter(item->item.getName().equals(name))
                .collect(Collectors.toList());
        if(!items.isEmpty())
        {
            return Optional.of(items.get(0));
        }
        else
        {
            return Optional.empty();
        }
    }

    @Override
    public boolean isQuantitySufficientForItem(Item item, int quantity) {
        return item.getQuantity() >= quantity;
    }

    //item->shopping cart item.
    @Override
    public void buyItem(Item item) {
        this.itemDao.updateItemQty(item.getId(), (int)item.getQuantity());
    }
    
     
    
}
