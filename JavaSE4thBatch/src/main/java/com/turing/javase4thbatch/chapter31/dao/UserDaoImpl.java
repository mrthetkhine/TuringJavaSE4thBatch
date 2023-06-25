/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter31.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author macbook
 */
public class UserDaoImpl implements UserDAO {

    static final String salt = "$!1292";
    @Override
    public boolean isAuthenticateUser(String userName, String password) {
        boolean isAuth = false; 
        password = password + salt;
         Connection con = DAO.getDAO().getConnection();
         String sql = "SELECT * FROM `user`\n" +
            "WHERE username=? \n" +
            "AND password = md5(?);";
        try(PreparedStatement stmt = con.prepareStatement(sql))
        {
            stmt.setString(1,userName);
            stmt.setString(2, password);
          
            try(ResultSet result=stmt.executeQuery())
            {
                isAuth = result.next();
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return isAuth;
    }
    
}
