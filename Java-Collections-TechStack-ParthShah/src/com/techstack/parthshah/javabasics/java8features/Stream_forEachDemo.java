package com.techstack.parthshah.javabasics.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.techstack.parthshah.javabasics.models.*;

public class Stream_forEachDemo {

	public static void main(String[] args) {
		
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("Sania");
		lst.add("Novac");
		lst.add("Federer");
		lst.add("Murray");
		lst.add("Mahesh");
		lst.add("XYZ");
		
		System.out.println("Tennis players are -:");
		
		lst.stream().forEach(x-> System.out.println(x));

		System.out.println("==============================================");
		
		System.out.println("Filtering one Tennis player -:");
		lst.stream().filter( x -> !x.equals("XYZ")).forEach(x-> System.out.println(x));
		System.out.println("--------------------------------------------------------");
		System.out.println("Demo for internal implementaiton of forEach -:");
		//internal implementaiton of forEach
		//lst.forEach(action);
		
		//actual implementation
		Consumer<String> consumer1 =  (str)-> System.out.println(str);
		for(String s: lst) {
			consumer1.accept(s);
		}
		
		System.out.println("==============================================");
		Map<String,String> mapTennis= new HashMap<>();
		mapTennis.put("Mahesh Bhupathi", "India");
		mapTennis.put("Sania Mirza", "India");
		mapTennis.put("Roger Federer", "Swiss");
		mapTennis.put("Novak Djokovic", "Serbia");
		mapTennis.put("XYZ", "Mars");
		mapTennis.put("xyz", "Jupiter");
		
		System.out.println("Printing Tennis players key,value without stream-:");
		mapTennis.forEach((k,v) -> System.out.println("Key - "+k + ",Value-" +v ));
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Printing Tennis players key,value with stream API,also filtering value-XYZ-:");
		mapTennis.entrySet().stream().filter(x -> !x.getKey().equalsIgnoreCase("Xyz")).forEach(x -> System.out.println(x));
		
		System.out.println("=======Demo end=======================================");
		
		
		
		
		
	}

}


