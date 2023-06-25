/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter31.service;

import com.turing.javase4thbatch.chapter31.dao.UserDAO;
import com.turing.javase4thbatch.chapter31.dao.UserDaoImpl;

/**
 *
 * @author macbook
 */
public class AuthImpl implements AuthService{

    UserDAO userDao  = new UserDaoImpl();
    @Override
    public boolean isValidUser(String userName, String password) {
        return userDao.isAuthenticateUser(userName, password);
    }
    
}
