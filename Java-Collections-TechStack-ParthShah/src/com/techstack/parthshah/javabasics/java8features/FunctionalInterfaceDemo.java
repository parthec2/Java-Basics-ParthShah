package com.techstack.parthshah.javabasics.java8features;

import java.util.Comparator;
import java.util.HashMap;

import com.techstack.parthshah.javabasics.models.*;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		//Runnable
		//Comparable<Integer>
		//Comparator<T>

	}

}

@FunctionalInterface
interface MyFunctionalInterface{
	
	public int cnt=10;
	public void m1();
	
	default void m2() {
		System.out.println("This is m2 method");
	}
	
	static void m3() {
		System.out.println("This is static m3 method");
	}
	
}


