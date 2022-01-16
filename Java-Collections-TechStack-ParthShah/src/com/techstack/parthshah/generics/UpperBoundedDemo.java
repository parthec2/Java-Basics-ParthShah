package com.techstack.parthshah.generics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedDemo {

	public static void main(String args[]) 
	{
		//DataSorterWithType is generic class with <T> - no bounded,so it accepts any type
//		List<Integer> lstInt = Arrays.asList(new Integer[] {5,2,8,1,9,100});
//		DataSorterWithType<Integer> objDataSorter = new DataSorterWithType<Integer>(lstInt);
//		objDataSorter.Sort();
//		List<String> lstIceCream = Arrays.asList(new String[] {"ButterScoth","Choclate","American DryFruit"});
//		DataSorterWithType<String> objDataSorterStr = new DataSorterWithType<String>(lstIceCream);
//		objDataSorterStr.Sort();
		
		List<Long> lstLong = Arrays.asList(new Long[] {99L,100L,5L,2L});
//		 //Upper Bounded Class demo
//		System.out.println("================================================================");
//		System.out.println("Upper Bounded Class demo");
//		DataSorterUpperBounded<Long> objDataSorterLong = new DataSorterUpperBounded<>(lstLong);
//		//DataSorterUpperBounded<String> objDataSorterStr = new DataSorterUpperBounded<>(lstLong);
//		objDataSorterLong.Sort();
		
		System.out.println("================================================================");
		 //Upper Bounded method demo
//		System.out.println("Upper Bounded method demo");
//		sortNumberSubTypesOnly(lstLong);
//		System.out.println("================================================================");
//		
//		System.out.println("================================================================");
		System.out.println("Demo for BoundedTypes with 2 custom interfaces-<T extends IceCream & Toppings>");
		
		//The object should implement both interface as type T is <T extends IceCream & Toppings> 
		ButterScotchIceCream objIceCream = new ButterScotchIceCream();
		getSortedData(objIceCream);
		System.out.println("================================================================");
		
	}	
	
	//Upperbounded type generic method
	public static <T extends Number> void sortNumberSubTypesOnly(List<T> lstNum){
		lstNum.sort(null);
		System.out.println(lstNum);
	}
	
	//We can extends from 2 custom interfaces by using "&"
	public static <T extends IceCream & Toppings> void getSortedData(T obj1) {
		//some logic
		System.out.println("getSortedData executed...");
	}
	
	
}//end of class-UpperBoundedDemo

interface IceCream{
	
}

interface Toppings{
	
}

class ButterScotchIceCream implements IceCream,Toppings{
	
}