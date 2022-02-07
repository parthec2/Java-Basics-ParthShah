package com.techstack.parthshah.javabasics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.techstack.parthshah.javabasics.models.*;

public class HashSet_TreeSet_Demo {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<>();
		set1.add("Saina Nehwal");
		set1.add("Sania Mirza");
		set1.add("Mahesh Bhupathi");
		System.out.println(set1.add("Mahesh Bhupathi"));
		set1.add("Sania Mirza");
		System.out.println("---------------------------------------------------");
		System.out.println("Printing HashSet values");
		System.out.println("----------------------------------");
		set1.stream().forEach(x-> {
			System.out.println(x);
		});
		
		//TreeSet Implements NavigableSet,SortedSet
		System.out.println("-====================================================================");
		System.out.println("---Tree Set Demo -------------------------------------------");
		System.out.println("---------------------------------------------------");
		Set<String> treeset1 = new TreeSet<>();
		treeset1.add("Nadal");
		treeset1.add("Saina Nehwal");
		
		treeset1.add("Roger Federrer");
		treeset1.add("Sania Mirza");
		treeset1.add("Zahesh Bhupathi");
		System.out.println(treeset1.add("Mahesh Bhupathi"));
		treeset1.add("Paes");
		treeset1.add("Sania Mirza");
		System.out.println("---------------------------------------------------");
		System.out.println("Printing TreeSet values-Sort by Asc");
		System.out.println("----------------------------------");
		treeset1.stream().forEach(x-> {
			System.out.println(x);
		});
		
		System.out.println("-====================================================================");
		System.out.println("---Tree Set Demo with Navigable features-------------------------------------------");
		System.out.println("---------------------------------------------------");
		
		TreeSet<Integer> treeSetNum = new TreeSet<Integer>();
		treeSetNum.add(25);
		treeSetNum.add(35);
		treeSetNum.add(45);
		treeSetNum.add(55);
		treeSetNum.add(95);
		treeSetNum.add(85);
		treeSetNum.add(15);
		treeSetNum.add(5);
		System.out.println("---------------------------------------------------");
		System.out.println("Printing TreeSet values-Sort by Asc");
		System.out.println("----------------------------------");
		treeSetNum.stream().forEach(x-> {
			System.out.println(x);//sorted by Asc
		});
		
		System.out.println("Return greatest num which is less than 45 in TreeSet-: "+treeSetNum.lower(45));//35
		System.out.println("Return greatest num which is less than or equal to 45 in TreeSet-: "+treeSetNum.floor(45));//45
		
		System.out.println("Get lowest number which is greater than 85 in TreeSet-: "+treeSetNum.higher(85));//95
		System.out.println("Get lowest number which is greater than or equal to 85 in TreeSet-: "+treeSetNum.ceiling(85));//85
		
		
		
		
	}

}


