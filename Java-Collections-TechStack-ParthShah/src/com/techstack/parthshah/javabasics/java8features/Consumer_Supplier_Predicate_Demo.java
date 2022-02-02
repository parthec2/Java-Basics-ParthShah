package com.techstack.parthshah.javabasics.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.techstack.parthshah.javabasics.models.*;

public class Consumer_Supplier_Predicate_Demo {

	public static void main(String[] args) {
		List<Integer> lst1 = Arrays.asList(8,1,2,5,6);
		
		System.out.println("======== Consumer Demo =====================================================");

		//Demo-Consumer<Integer> consumer1= public void  (Integer i) --> { //some implementation}
		Consumer<Integer> consumer1= 
		(i) ->
		{
			System.out.println("Consumer Prints - "+ i);
		};
		
		consumer1.accept(50000);//Note-accept is SAM in Consumer interface

		/*
		lst1.stream().forEach(consumer1);
		lst1.stream().forEach((i)-> System.out.println("Consumer Lambda Prints - "+ i));

		
		System.out.println("======== Predicate Demo =====================================================");
		Predicate<Long> predicate1 = 
		(Long num)-> 
		{ 
			//implementation of "test(T t)" method of predicate interface
			if(num % 2==0) {
				return true;
			}
			else {
				return false;
			}
		};
		
		System.out.println("5 is even ? - "+ predicate1.test(5L));
		System.out.println("6 is even ? - "+ predicate1.test(6L));

		lst1.stream().forEach(x-> System.out.println(x));
		lst1.stream()
			.filter( num -> { return (num % 2==0); })
			.forEach(x-> System.out.println("Even numbers are - "+ x));
		
		
		*/
		
		/*
		System.out.println("======== Supplier Demo =====================================================");
		Supplier<Integer> supplier1 = () -> {return 0 ;};//some default value
		System.out.println(supplier1.get());
		
		ArrayList<Integer> arrylst2 = new ArrayList<>();
		
		//get only first available value or return some default value which is return by supplier1
		System.out.println(arrylst2.stream().findAny().orElseGet(supplier1));

		//As array list is clear so it shd return default value by supplier1 which is 0
		System.out.println("List is empty so value return by supplier is - " + arrylst2.stream().findAny().orElseGet(supplier1));
		*/
		
		
	}

}
