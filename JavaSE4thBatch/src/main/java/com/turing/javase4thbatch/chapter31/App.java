/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter31;

import com.turing.javase4thbatch.chapter31.service.AuthImpl;
import com.turing.javase4thbatch.chapter31.service.AuthService;
import com.turing.javase4thbatch.chapter31.service.ItemService;
import com.turing.javase4thbatch.chapter31.service.ItemServiceImpl;

/**
 *
 * @author macbook
 */
public class App {
    static App app;
    private ItemService itemService;
    private AuthService authService;
    private App()
    {
        this.itemService = new ItemServiceImpl();
        this.authService = new AuthImpl();
    }
    public static App getApp()
    {
        if(app == null)
        {
            app = new App();
        }
        return app;
    }
    ItemService getItemService()
    {
        return this.itemService;
    }
    public static void main(String[] args) {
        App app = App.getApp();
        App app2 = App.getApp();
        System.out.println("App == app2 "+(app == app2));
    }

    public AuthService getAuthService() {
        return authService;
    }
    
}
