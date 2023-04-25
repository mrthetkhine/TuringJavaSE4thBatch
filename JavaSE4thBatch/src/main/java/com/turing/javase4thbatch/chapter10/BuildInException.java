/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter10;

/**
 *
 * @author macbook
 */
public class BuildInException {
    public static void main(String[] args) {
        String str = null;
        int[] arr = new int[]{1,2,};
        try
        {
            //System.out.println("Uppercase "+str.toLowerCase());
            arr[3] = 4;
        }
        /*
        catch(Exception e)
        {
            System.out.println("Ae or "+ e.getMessage());
        }
        */
        
        catch(ArrayIndexOutOfBoundsException | NullPointerException ae)
        {
            System.out.println("Ae "+ae.getMessage());
        }
        /*
        catch(NullPointerException ne)
        {
            System.out.println("Ne "+ne.getMessage());
        }*/
        
        System.out.println("Another line");
    }
}
