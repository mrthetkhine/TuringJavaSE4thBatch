/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
@Target(ElementType.FIELD)
//@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface NotNull
{
    String message() default "Field should not be null";
}
class Human
{
    @NotNull
    String name;
    
    String address;
}
class Another
{
    @NotNull(message="Something should not be null")
    String something;
    
    //@NotNull
    void method()
    {
    }
}
class Validator
{
    static void validate(Object object)
    {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            //System.out.println("Field name "+field.getName());
            //System.out.println("Field type "+field.getType());
            
            NotNull notNull = field.getAnnotation(NotNull.class);
            if(notNull != null)
            {
                //System.out.println("Not Null");
                try {
                    Object value = field.get(object);
                    if(value == null)
                    {
                        System.err.println("Field "+field.getName()+" is null "+notNull.message());
                    }
                } catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                } catch (IllegalAccessException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
public class ValidationAnnotation {
    public static void main(String[] args) {
        Human obj = new Human();
        //obj.name = "";
        
        Validator.validate(obj);
        
        Another another =new Another();
        Validator.validate(another);
    }
}
