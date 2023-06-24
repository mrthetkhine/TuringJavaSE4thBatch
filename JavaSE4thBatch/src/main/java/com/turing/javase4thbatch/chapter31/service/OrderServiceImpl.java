/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter31.service;

import com.turing.javase4thbatch.chapter31.dao.ItemDAO;
import com.turing.javase4thbatch.chapter31.dao.ItemDAOImpl;
import com.turing.javase4thbatch.chapter31.dao.OrderDao;
import com.turing.javase4thbatch.chapter31.dao.OrderDaoImpl;
import com.turing.javase4thbatch.chapter31.dao.OrderItemDao;
import com.turing.javase4thbatch.chapter31.dao.OrderItemDaoImpl;
import com.turing.javase4thbatch.chapter31.model.Order;
import com.turing.javase4thbatch.chapter31.model.ShoppingCart;
import com.turing.javase4thbatch.chapter31.model.ShoppingCartItem;
import java.util.List;

/**
 *
 * @author macbook
 */
public class OrderServiceImpl implements OrderService{
    OrderDao orderDao;
    OrderItemDao orderItemDao;
    ItemDAO itemDao;
    public OrderServiceImpl()
    {
        this.orderDao = new OrderDaoImpl();
        this.orderItemDao = new OrderItemDaoImpl();
        this.itemDao = new ItemDAOImpl();
    }
    
    /*
    public void checkOut(ShoppingCart cart)
    {
        List<ShoppingCartItem> items = cart.getAllItems();
        for(ShoppingCartItem cartItem : items)
        {
            String itemName = cartItem.getName();
            Optional<Item> itemResult = this.getItemByName(itemName);
            if(itemResult.isPresent())
            {
                Item item = itemResult.get() ;
                item.setQuantity(item.getQuantity() - cartItem.getQuantity());
            }
        }
    }
    */
    public void checkOut(ShoppingCart cart)
    {
        long orderId = this.orderDao.createOrder(1);
        List<ShoppingCartItem> items = cart.getAllItems();
        for(ShoppingCartItem cartItem : items)
        {
           this.orderItemDao.saveOrderItem(orderId, cartItem);
           this.itemDao.updateItemQty(cartItem.getId(), (int)cartItem.getQuantity());
        }
    }

    @Override
    public List<Order> getAllOrder() {
        return this.orderDao.getAllOrders();
    }
}
