/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter31.dao;

import com.turing.javase4thbatch.chapter31.model.ShoppingCartItem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class OrderItemDaoImpl implements OrderItemDao{

    @Override
    public void saveOrderItem(long orderId, ShoppingCartItem item) {
      
        String sql = "INSERT INTO order_items(order_id,product_id,quantity)\n" +
        "VALUES(?,?,?);";
         Connection con = DAO.getDAO().getConnection();
        try(PreparedStatement stmt = con.prepareStatement(sql))
        {
            stmt.setLong(1,orderId);
            stmt.setLong(2,item.getId());
            stmt.setLong(3,(long)item.getQuantity());
            stmt.executeUpdate();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    @Override
    public List<ShoppingCartItem> getOrderDetails(long orderId) {
        List<ShoppingCartItem> items = new ArrayList<>();
        String sql = "SELECT item.name,item.price, order_items.quantity \n" +
                    "FROM order_items,item\n" +
                    "WHERE order_id = ?\n" +
                    "AND order_items.product_id = item.id;";
         Connection con = DAO.getDAO().getConnection();
        try(PreparedStatement stmt = con.prepareStatement(sql))
        {
            stmt.setLong(1,orderId);
          
            try(ResultSet result=stmt.executeQuery())
            {
                while(result.next())
                {
                    ShoppingCartItem item = new ShoppingCartItem();
                    item.setName(result.getString("name"));
                    item.setPrice(result.getDouble("price"));
                    item.setQuantity(result.getLong("quantity"));

                    items.add(item);
                }
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return items;
    }

    
    
}
