/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter31.dao;

import com.turing.javase4thbatch.chapter31.model.Item;
import com.turing.javase4thbatch.chapter9.jdbc.model.Movie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class ItemDAOImpl implements ItemDAO{

    List<Item> items = new ArrayList<Item>();

    public ItemDAOImpl() {
        /*
        this.items.add(new Item("Apple",30.5,50));
        this.items.add(new Item("Orange",20,100));
        this.items.add(new Item("Banana",15,35));
        */
    }
    
    
    @Override
    public List<Item> getAllItem() {
        List<Item> items = new ArrayList<>();
        Connection con = DAO.getDAO().getConnection();
        
        try(Statement stmt = con.createStatement())
        {
            String sql = "SELECT * FROM item;";
            try(ResultSet result = stmt.executeQuery(sql))
            {
                while(result.next())
                {
                   Item item = getItemFromResultSet(result);
                   
                   items.add(item);
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
        return items;
    }

    private Item getItemFromResultSet(final ResultSet result) throws SQLException {
        Item item = new Item();
        item.setId(result.getLong("Id"));
        item.setName(result.getString("name"));
        item.setPrice(result.getDouble("price"));
        item.setQuantity(result.getLong("quantity"));
        return item;
    }

    @Override
    public void addItem(Item item) {
        int rowCount =0;
         String sql = "INSERT INTO item(name,price,quantity)\n" +
        "VALUES(?,?,?);";
         Connection con = DAO.getDAO().getConnection();
        try(PreparedStatement stmt = con.prepareStatement(sql))
        {
            stmt.setString(1, item.getName());
            stmt.setDouble(2, item.getPrice());
            stmt.setDouble(3, item.getQuantity());
            
            rowCount = stmt.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
    }

    @Override
    public void updateItemQty(long id, int qty) {
        String sql = "UPDATE item set quantity=quantity-? WHERE id=?\n";
        Connection con = DAO.getDAO().getConnection();
        try(PreparedStatement stmt = con.prepareStatement(sql))
        {
            stmt.setLong(1, qty);
            stmt.setDouble(2, id);
           
            stmt.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
   
    
    
}
