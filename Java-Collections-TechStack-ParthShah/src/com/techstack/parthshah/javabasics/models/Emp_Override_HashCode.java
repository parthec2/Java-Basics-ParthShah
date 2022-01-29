package com.techstack.parthshah.javabasics.models;


//Java program to illustrate
//Overriding only the equals(Object) method
import java.io.*;
import java.util.*;

public class Emp_Override_HashCode 
{
    String name;
    int id;
       
    public Emp_Override_HashCode(String name, int id)
    {
        this.name = name;
        this.id = id;
     }
      
    @Override
    public int hashCode()
    {
           
        // We are returning the Geek_id 
        // as a hashcode value.
        // we can also return some 
        // other calculated value or may
        // be memory address of the 
        // Object on which it is invoked. 
        // it depends on how you implement 
        // hashCode() method.
        return this.id;
    }
       
}