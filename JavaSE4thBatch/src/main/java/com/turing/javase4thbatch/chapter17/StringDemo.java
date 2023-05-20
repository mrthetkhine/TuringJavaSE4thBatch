/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter17;

/**
 *
 * @author macbook
 */
class Data
{
    int data;
    Data(int data)
    {
        this.data = data;
    }
    public String toString()
    {
        return "[Data data="+data+"]";
    }
}
public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = new String("Hello");
        
        char ch[] = {'h','e','l','l','o'};
        String str3 = new String(ch);
        
        String str4 = "Hello";
        
        System.out.println("Str "+str);
        System.out.println("Str2 "+str2);
        System.out.println("Str3 "+str3);
        
        System.out.println("Length "+str.length());
        System.out.println("Str == str4 "+ (str == str4));
        System.out.println("Str == str2 "+ (str == str2));
        
        Data data = new Data(5);
        System.out.println("Data is "+data);  
        System.out.println("Char At "+ str.charAt(0));
        
        char dest[] = new char[5];
        str.getChars(0, 3, dest, 0);
        System.out.println("get Char "+new String(dest));
        
        byte []bytes = new byte[5];
        System.out.println("Get bytes "+ str.getBytes());
        System.out.println("Char Arry "+str.toCharArray());
        
        System.out.println("Equals "+ str4.equals(str2));
        System.out.println("EqualsIgnore "+ str3.equalsIgnoreCase(str4));
        
    }
}
