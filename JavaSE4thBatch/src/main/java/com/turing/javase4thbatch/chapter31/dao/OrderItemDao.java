/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter31.dao;

import com.turing.javase4thbatch.chapter31.model.ShoppingCartItem;

/**
 *
 * @author macbook
 */
public interface OrderItemDao {
    void saveOrderItem(long orderId,ShoppingCartItem item);
}
