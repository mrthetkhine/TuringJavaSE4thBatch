/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter20;

import java.util.ListResourceBundle;

/**
 *
 * @author macbook
 */
public class SampleRB_de extends ListResourceBundle{

    @Override
    protected Object[][] getContents() {
        Object[][] content = new Object[2][2];
        
        content[0][0] = "Title";
        content[0][1] = "German Program";
        
        content[1][0] = "StopText";
        content[1][1] = "German Stop";
        
        return content;
    }
    
}

