/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter31.service;

/**
 *
 * @author macbook
 */
public class AuthImpl implements AuthService{

    @Override
    public boolean isValidUser(String userName, String password) {
        return "admin".equals(userName) && "admin".equals(password);
    }
    
}
