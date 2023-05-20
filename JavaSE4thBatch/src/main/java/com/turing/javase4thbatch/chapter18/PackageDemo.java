/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class PackageDemo {
    public static void main(String[] args) {
        Package packages [] = Package.getPackages();
        for(Package pack : packages)
        {
            System.out.println("Package "+pack.getName());
            System.out.println("Title "+pack.getImplementationTitle());
            System.out.println("Vendor "+ pack.getImplementationVendor());
        }
        
        try
        {
            throw new Exception("Something went wrong");
        }
        catch(Exception e)
        {
            StackTraceElement elements[] = e.getStackTrace();
            for(StackTraceElement ele : elements)
            {
                System.out.println("File "+ele.getFileName() + " Method "+ ele.getMethodName() +  " line "+ele.getLineNumber());
            }
        }
    }
}
