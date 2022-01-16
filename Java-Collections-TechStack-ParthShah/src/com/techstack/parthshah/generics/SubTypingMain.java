package com.techstack.parthshah.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubTypingMain {

	public static void main(String[] args) {
//		Object o1 = new Object();
//		Integer i1= new Integer(2);
//		o1=i1;//it works fine as Integer is subclass of Object
//		System.out.println(o1);
//		System.out.println("=========================================");
		
		//List<Number> lstNum2 = new ArrayList<Integer>();//will give compile error 
		
		System.out.println("Passing Int,Long to Number list");
//		List<Number> lstNum= new ArrayList<Number>();
//		Number n= 10;
//		lstNum.add(n);
//		lstNum.add(new Integer(20));
//		lstNum.add(new Long(40));
//		lstNum.stream().forEach(x-> System.out.println(x));
		
		
		System.out.println("=============Demo of subtyping in List============================");
		List<Box<Integer>> lstBox = new ArrayList<Box<Integer>>();
		//List<Box<Integer>> lstBox2 = new ArrayList<>();
		lstBox.add(new Box<Integer>(Arrays.asList(2,3)));
		
		lstBox.add(new SquareBox<Integer>(Arrays.asList(1,9)));
		lstBox.stream().forEach(objBox-> System.out.println(objBox.getLstVal()));
		System.out.println("================= End of class ==============================================");
		
		//Interview question
		//Invalid- Type mismatch- Cannot convert ArrayList<Integer> to ArrayList<Number>
//		ArrayList<Number> lstNumInvalid = new ArrayList<Integer>();
//		List<Box<Integer>> lstBoxInvalid = new ArrayList<SquareBox<Integer>>();
       
	}
	
	
}//end of class



