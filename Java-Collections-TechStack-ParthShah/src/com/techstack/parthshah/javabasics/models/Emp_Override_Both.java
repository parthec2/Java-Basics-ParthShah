package com.techstack.parthshah.javabasics.models;


//Java program to illustrate
//Overriding only the equals(Object) method
import java.io.*;
import java.util.*;

public class Emp_Override_Both 
{
	 private String name;
	 private int id;
    
	 public Emp_Override_Both(String name, int id)
	 {
	     this.name = name;
	     this.id = id;
	  }
    
	 @Override
	 public boolean equals(Object obj)
	 {
	    // if both the object references are 
	    // referring to the same object.
	    if(this == obj)
	         return true;
	         
	     // it checks if the argument is of the 
	     // type Employee by comparing the classes 
	     // of the passed argument and this object.
	     // if(!(obj instanceof Employee)) return false; ---> avoid.
	     if(obj == null || obj.getClass()!= this.getClass())
	         return false;
	         
	     // type casting of the argument.    
	     Emp_Override_Both objEmp = (Emp_Override_Both) obj;
	         
	     // comparing the state of argument with 
	     // the state of 'this' Object.
	     return (objEmp.name.equals(this.name) && objEmp.id == this.id);
	 }
	 
	 	@Override
	 	public int hashCode() {
	 		return this.id;
	 	}
 
}