package com.techstack.parthshah.generics;

import java.util.List;

public class DataMain {

	public static void main(String[] args) {

//		//Raw Class-without Type
//		DataGen objRaw = new DataGen();
//		objRaw.setData("I am string data");
//		String s = (String) objRaw.getData();
//		System.out.println(s);
//		
//		//objRaw.setData(22);
////		//Runtime exception- java.lang.ClassCastException if we use DataRaw
//		//s = (String) objRaw.getData();
//
//		//Generic Class-Java 5
//		DataGen<String> objStr= new DataGen<>();
//		objStr.setData("I am string data in DataGen<String> class...");
//		//Type safety
//		//objStr.setData(2);
//		System.out.println(objStr.toString());
//
//		DataGen<Integer> objInt= new DataGen<>();
//		objInt.setData(2);
//		System.out.println(objInt.toString());
		
		//Generic Interfaces
		IDataGen<String>  iobj = new DataGen<>();
		iobj.setData("I am string data in IDataGen<String>, Generic Interface ...");
		System.out.println(iobj.toString());
		
		//public interface Comparable<T>
		
		
	}	
	
		
}
