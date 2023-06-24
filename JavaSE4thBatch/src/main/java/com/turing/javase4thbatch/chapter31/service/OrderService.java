/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase4thbatch.chapter31.service;

import com.turing.javase4thbatch.chapter31.model.Order;
import com.turing.javase4thbatch.chapter31.model.ShoppingCart;
import java.util.List;

/**
 *
 * @author macbook
 */
public interface OrderService {
    void checkOut(ShoppingCart cart);
    List<Order> getAllOrder();
}
