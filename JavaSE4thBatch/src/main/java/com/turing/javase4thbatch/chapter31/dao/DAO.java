/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter31.dao;

import com.turing.javase4thbatch.chapter9.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class DAO {
    private static DAO singleton;
    private Connection con;
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    private DAO()
    {
        try 
        {
            String jdbcUrl = "jdbc:mysql://localhost:3306/pos";
            this.con = DriverManager.getConnection(jdbcUrl, "root", "Root@3421C");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static DAO getDAO()
    {
        if(singleton ==null)
        {
            singleton = new DAO();
        }
        return singleton;
    }
    public Connection getConnection()
    {
        return this.con;
    }
    public static void main(String[] args) {
        DAO dao = DAO.getDAO();
    }
}
