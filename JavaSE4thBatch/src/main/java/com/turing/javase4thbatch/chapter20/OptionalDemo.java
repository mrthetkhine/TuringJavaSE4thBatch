package com.turing.javase4thbatch.chapter20;


import java.util.Optional;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macbook
 */
interface Inc 
{
    int func(int x);
}
public class OptionalDemo {
 
    static int getData()
    {
        return 10;
    }
    public static void main(String[] args) {
        Integer i = null;
        //i++;
        //Inc inc = (x)-> x +1;
        
        Optional<Integer> data = Optional.ofNullable(i);
        
        Optional<Integer> result = data.flatMap(x->Optional.of(x+1))
                                       .map(x-> x * 2) ;
        if(result.isPresent())
        {
            System.out.println("Value "+result.get());
        }
        System.out.println("OrElse "+ result.orElse(0));
        System.out.println("Empty "+result.isEmpty());
        System.out.println("GetOrElse "+result.orElseGet(OptionalDemo::getData));
        result.orElseThrow();
    }
}
