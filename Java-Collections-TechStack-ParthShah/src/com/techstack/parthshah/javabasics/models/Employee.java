package com.techstack.parthshah.javabasics.models;


//Java program to illustrate
//Overriding only the equals(Object) method
import java.io.*;
import java.util.*;

public class Employee 
{
	 private String name;
     private int id;
	 private String department;
	 	private String position;
	 private String managerName;
	 private String companyName;
	 
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	 public Employee(String name, int id,String department,String position,String managerName,String companyName)
	 {
	     this.name = name;
	     this.id = id;
	     this.department = department;
	     this.position = position;
	     this.managerName = managerName;
	     this.companyName = companyName;
	  }
 
	 public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public String getManagerName() {
			return managerName;
		}

		public void setManagerName(String managerName) {
			this.managerName = managerName;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}


}