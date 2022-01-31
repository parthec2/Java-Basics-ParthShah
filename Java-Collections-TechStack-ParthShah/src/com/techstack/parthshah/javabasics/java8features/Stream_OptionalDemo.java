package com.techstack.parthshah.javabasics.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

import com.techstack.parthshah.javabasics.models.Cricketer;
import com.techstack.parthshah.javabasics.models.Employee;

public class Stream_OptionalDemo {

	public static void main(String[] args) {
		Optional<Object> optEmpty = Optional.empty();
		System.out.println(optEmpty);
		
		Employee objEmp = new Employee("Bhavin", 22, null,"Tech Lead","Suresh","Fintech Company");
		String department = objEmp.getDepartment();
		
		//of() throws NullPointer exception if value is null		
//		 Optional<String> s1 = Optional.of( objEmp.getDepartment());
		 
		//ofNullable() dont throw NullPointer exception rather return empty Optional object when value is null
		//Always go with ofNullable method to avoid any exceptions
		Optional<String> s2 = Optional.ofNullable( objEmp.getDepartment());
		 System.out.println("s2 is- "+ s2);
		 objEmp.setDepartment("IT");
		 Optional<String> s3 = Optional.ofNullable( objEmp.getDepartment());
		 if(s3.isPresent()) {
			 System.out.println("s3 is- "+ s3.get());	 
		 }
		 
		 
		 Employee objEmp2 = new Employee("Parth", 97, "ABC Dept","Tech Lead","Nilesh",null);
		 //company name is null
		 Optional<String> companyOpt = Optional.ofNullable(objEmp2.getCompanyName());
		 //companyName.orElseGet(  () -> "Citi");
		 System.out.println("companyName is- "+ companyOpt); //Optional.empty
		 System.out.println("companyName is- "+ companyOpt.orElse("CC"));
		 
//		 System.out.println("companyName is- "+ companyOpt.orElseThrow( () -> new IllegalArgumentException("Pls set Company name... ") ) );
		 objEmp2.setCompanyName("Citii");
		 Optional<String> companyOpt222 = Optional.ofNullable(objEmp2.getCompanyName());
		 System.out.println("Length of companyName is- "+ companyOpt222.map(String:: length ).orElseThrow( () -> new IllegalArgumentException("Pls set Company name... ") ) );
		 System.out.println("companyName is- "+ companyOpt222.orElseThrow( () -> new IllegalArgumentException("Pls set Company name... ") ) );
		 
		 List<Integer> arryLst = new ArrayList<Integer>();
		 Integer findAny = arryLst.stream().findAny().orElse(-1);//set default value ot -1 
		 System.out.println("Value in list is -: " + findAny);
		 
		 arryLst.add(007);
		 Integer findAny222 = arryLst.stream().findAny().orElse(-1);
		 System.out.println("Value in list is -: " + findAny222);
	}
	
	
}