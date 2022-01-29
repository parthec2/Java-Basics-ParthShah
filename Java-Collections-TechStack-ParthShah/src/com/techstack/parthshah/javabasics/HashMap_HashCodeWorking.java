package com.techstack.parthshah.javabasics;

import java.util.HashMap;

import com.techstack.parthshah.javabasics.models.*;

public class HashMap_HashCodeWorking {

	public static void main(String[] args) {

		Emp_Override_Both objEmpBoth = new Emp_Override_Both("objEmpBoth Instance",1);
		Emp_Override_Both objEmpBoth2 = new Emp_Override_Both("objEmpBoth2 Instance",1);
		
		System.out.println("----Both obj are NOT equals and hashcode is same------------------------------------------");
		System.out.println("objEmpBoth.equals(objEmpBoth2) - "+objEmpBoth.equals(objEmpBoth2));//false
		System.out.println("objEmpBoth HashCode -" + objEmpBoth.hashCode() + ",objEmpBoth2 HashCode-" + objEmpBoth2.hashCode() );
		
		HashMap<Emp_Override_Both, String> hmBoth = new HashMap<>();
		hmBoth.put(objEmpBoth, "ABC");
		hmBoth.put(objEmpBoth2, "XYZ");//equals-false
		
		System.out.println("Demo- Class overrides both value");
		System.out.println("HashMap stores both object because both objects has same hashcode but both object are not equals- (using equals method)");
		for(Emp_Override_Both key: hmBoth.keySet()) {
			System.out.println(hmBoth.get(key) + ",HashCode-"+ key.hashCode());
		}

		System.out.println("----Both obj are equals and hashcode is same------------------------------------------");
		//Emp Name and Id are same for both ,so Equals will return true
		Emp_Override_Both objEmpBoth4 = new Emp_Override_Both("MMM",1);
		Emp_Override_Both objEmpBoth5 = new Emp_Override_Both("MMM",1);  
		
		System.out.println("Equals- "+objEmpBoth4.equals(objEmpBoth5));
		
		hmBoth = new HashMap<>();
		hmBoth.put(objEmpBoth4, "Val1");
		hmBoth.put(objEmpBoth5, "Val2");//Val2 overrides Val1
		
		System.out.println("HashMap will override prev obj value as both objects has same hashCode and both objects are equals ");
		for(Emp_Override_Both key: hmBoth.keySet()) {
			System.out.println(hmBoth.get(key) + ",HashCode is - "+ key.hashCode());
		}

		System.out.println("==============================================================================");
		System.out.println("----Both objects are equal but hashcode is different as its not overridden method------------------------------------------");
		Emp_Override_Equals objEmpEq1 = new Emp_Override_Equals("MMM",1);
		Emp_Override_Equals objEmpEq2 = new Emp_Override_Equals("MMM",1);  
		
		System.out.println("objEmpEq1 HashCode -" + objEmpEq1.hashCode() + ",objEmpEq2 HashCode-" + objEmpEq2.hashCode() );
		System.out.println("objEmpEq1.equals(objEmpEq2) - "+ objEmpEq1.equals(objEmpEq2));//true
		
		HashMap<Emp_Override_Equals, String> hmEq = new HashMap<>();
		hmEq.put(objEmpEq1, "Eq1");
		hmEq.put(objEmpEq2, "Eq2");
		
		System.out.println("--Its violating java.lang.Object contract --HashMap is storing both values eventhough both objs are equals (hashcode is different ) ");
		for(Emp_Override_Equals key: hmEq.keySet()) {
			System.out.println(hmEq.get(key) + ",HashCode is -"+ key.hashCode());
		}

		System.out.println("==============================================================================");
		System.out.println("-------Both objects have same hashcode but both objects are not equal as equals method is not override------");
		//Both objects have same hashcode but both objects are not equal as equals method is not override,
		//so it does equals java.land.Object method which is obj1==obj2(reference type) which is not equal   
		Emp_Override_HashCode objEmpHashCd1 = new Emp_Override_HashCode("MMM",1);
		Emp_Override_HashCode objEmpHashCd2 = new Emp_Override_HashCode("MMM",1);  
		
		//same hashcode
		System.out.println("objEmpHashCd1 HashCode -" + objEmpHashCd1.hashCode() + ",objEmpHashCd2 HashCode-" + objEmpHashCd2.hashCode() );
		System.out.println("objEmpHashCd1.equals(objEmpHashCd2) - "+ objEmpHashCd1.equals(objEmpHashCd2));//false
		
		HashMap<Emp_Override_HashCode, String> hmHC = new HashMap<>();
		hmHC.put(objEmpHashCd1, "HC1");
		hmHC.put(objEmpHashCd2, "HC2");
		
		System.out.println("--Its violating java.lang.Object contract --HashMap is storing both values eventhough both objs are NOT equals and hashcode is same");
		for(Emp_Override_HashCode key: hmHC.keySet()) {
			System.out.println(hmHC.get(key) + ",HashCode is -"+ key.hashCode());
		}
		
		System.out.println("==============================================================================");

	}

}


