/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter19;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author macbook
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        
        queue.add("One");
        queue.add("two");
        
        System.out.println("Head "+queue.element());
        
        System.out.println("Queue");
        queue.stream().forEach(System.out::println);
        
        System.out.println("Offer "+queue.offer("three"));
        System.out.println("Offer");
        queue.stream().forEach(System.out::println);
        
        System.out.println("Peek "+queue.peek());
        System.out.println("Poll "+queue.poll());
        
        System.out.println("After poll");
        queue.stream().forEach(System.out::println);
        
        queue.remove();
        System.out.println("Remove --");
        queue.stream().forEach(System.out::println);
    }
}
