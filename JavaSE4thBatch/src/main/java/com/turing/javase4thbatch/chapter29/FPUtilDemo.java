/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
enum Gender
{
    Male,Female;
}
class Human
{
    String name;
    int age;
    Gender gender;
    
    Human(String name, int age, Gender gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
public class FPUtilDemo {
   
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<>();
        
        list.add(new Human("Maung Aung",27, Gender.Male));
        list.add(new Human("Maung Mya",17, Gender.Male));
        list.add(new Human("Win Win",30, Gender.Female));
        list.add(new Human("Hla Aung",28, Gender.Male));
        list.add(new Human("Mya Mya",25, Gender.Female));
        list.add(new Human("Naing Aung",32, Gender.Male));
        
        //get name of man over 25.
        Stream<String> names = list.stream()
                                    .filter(obj-> obj.age >25 && obj.gender == Gender.Male)
                                    .map(obj-> obj.name);
        names.forEach((x)-> System.out.println("Name "+x));
        
        Optional<Human> oldestFemale = list.stream()
                                            .filter(obj-> obj.gender == Gender.Female)
                                            .max((a,b)-> a.age-b.age);
        if(oldestFemale.isPresent())
        {
            System.out.println("Oldest female "+oldestFemale.get().name);
        }
    }
}
