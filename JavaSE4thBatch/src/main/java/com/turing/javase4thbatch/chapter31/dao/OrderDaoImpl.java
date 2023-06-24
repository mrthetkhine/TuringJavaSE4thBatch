/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter31.dao;

import com.turing.javase4thbatch.chapter31.model.Item;
import com.turing.javase4thbatch.chapter31.model.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class OrderDaoImpl implements OrderDao{
    @Override
    public long createOrder(int userId)
    {
        long id = 0;
        String sql = "INSERT INTO `order`(user_id) " +
        "VALUES(?);";
         Connection con = DAO.getDAO().getConnection();
        try(PreparedStatement stmt = con.prepareStatement(sql))
        {
            stmt.setLong(1,userId);
            stmt.executeUpdate();
            
            String query = "SELECT LAST_INSERT_ID();";
            try(PreparedStatement queryStmt = con.prepareStatement(query))
            {
                ResultSet result = queryStmt.executeQuery();
                if(result.next())
                {
                    id = result.getLong(1);
                }
                result.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public List<Order> getAllOrders() {
        List<Order> orders = new ArrayList<>();
        Connection con = DAO.getDAO().getConnection();
        
        try(Statement stmt = con.createStatement())
        {
            String sql = "SELECT * FROM `order`;";
            try(ResultSet result = stmt.executeQuery(sql))
            {
                while(result.next())
                {
                   Order order = new Order();
                   order.setId(result.getLong("id"));
                   order.setUserId(result.getLong("user_id"));
                   order.setOrderDate(result.getDate("order_date"));
                   orders.add(order);
                }
            }
            catch(Exception re)
            {
                re.printStackTrace();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return orders;
    }
}
