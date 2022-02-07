package com.techstack.parthshah.javabasics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.techstack.parthshah.javabasics.models.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> sports = new ArrayList<String>();
		sports.add("Virat");
		sports.add("Rohit");
		sports.add("Gayle");//maintains insertion order 
		
		sports.add(0, "Dhoni");//insert at specific position
		sports.add("Dhoni");
		
		System.out.println(sports);
		System.out.println("List.contains-: "+sports.contains("Rohit"));
		System.out.println("List.indexOf-: "+sports.indexOf("Rohittt"));//-1 if element is not present
		//System.out.println();
		System.out.println("Get method-: "+ sports.get(1));
		
		Collections.sort(sports);
		System.out.println("Priting arrayList in asc sorting order-:");
		Iterator<String> iterator = sports.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}


