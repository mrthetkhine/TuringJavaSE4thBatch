/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase4thbatch.chapter31.dao;

import com.turing.javase4thbatch.chapter31.model.Item;
import java.util.List;

/**
 *
 * @author macbook
 */
public interface ItemDAO {
    void addItem(Item item);
    List<Item> getAllItem();
}
