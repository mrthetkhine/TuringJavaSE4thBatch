/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter19;

import java.util.LinkedList;
import java.util.Deque;

/**
 *
 * @author macbook
 */
public class DqueueDemo {
    public static void main(String[] args) {
        Deque<String> deque =  new LinkedList<String>();
        
        deque.add("One");
        deque.add("two");
        
        deque.addFirst("First");
        deque.addLast("Last");
        
        deque.stream().forEach(System.out::println);
        
        System.out.println("GetFirst "+ deque.getFirst());
        System.out.println("GetLast "+ deque.getLast());
        
        System.out.println("Get First getlast--");    
        deque.stream().forEach(System.out::println);
        
        System.out.println("Offerfirst "+deque.offerFirst("1st"));
        
        System.out.println("OfferFirst--");    
        deque.stream().forEach(System.out::println);
        
        System.out.println("OfferLast "+deque.offerLast("end"));
        deque.stream().forEach(System.out::println);
        
        System.out.println("Pop "+deque.pop());
        deque.push("How");
        
        System.out.println("After push -----");
        deque.stream().forEach(System.out::println);
    }
}
