/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 *
 * @author macbook
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
    String message();
}
class DemoClass
{
    @MyAnno(message="Some data")
    void method()
    {
        System.out.println("method");
    }
    void another(String msg)
    {
        System.out.println("Another method");
    }
}
public class CustomAnnoation {
    public static void main(String[] args) {
        DemoClass obj = new DemoClass();
        
        Class clazz = obj.getClass();
        System.out.println("ClassName "+clazz.getName());
        
        //print method
        Method methods[] = clazz.getDeclaredMethods();
        for(Method method : methods)
        {
            System.out.println("Name "+method.getName());
            System.out.println("Return type "+method.getReturnType());
            
            Class<?>[] parameters  = method.getParameterTypes();
            for(Class parType : parameters)
            {
                System.out.println("Parameter type "+parType.getName());
            }
            System.out.println("Annotation===");
            Annotation[] annotations= method.getAnnotations();
            
            for (Annotation anno: annotations) {
                System.out.println("Anno "+anno);
                if(anno instanceof MyAnno)
                {
                    MyAnno myAnno = (MyAnno)anno;
                    System.out.println("Data message "+myAnno.message());
                }
            }
            MyAnno myAnno = method.getAnnotation(MyAnno.class);
            System.out.println("MyAnno "+myAnno);
        }
    }
}
