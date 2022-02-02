package com.techstack.parthshah.javabasics.java8features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.*;


//To run this class,pls install jdk 16 on your machine and build path to jdk16 as below 
//Right click project-->build Path-->configuure build path-->Libraries-->click Edit-->Alternate jre drop down-->select jdk16
public class Java12_13_14_NewMethods {

	
	public static void main(String[] args) throws IOException {
		String s= null;
		//jdk -16-message-More descriptive message after jdk 11 for nullpointer exception
		//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isBlank()" because "s" is null
		//at com.techstack.parthshah.javabasics.java8features.Java12_13_14_NewMethods.main(Java12_13_14_NewMethods.java:20)

		//jdk-1.8
		//Exception in thread "main" java.lang.NullPointerException
		//at com.techstack.parthshah.javabasics.java8features.Java12_13_14_NewMethods.main(Java12_13_14_NewMethods.java:24)
		
//		System.out.println(s.toLowerCase());
		
		//isBlank new method in jdk-11,check if whitespace then return true

		System.out.println("  ".isBlank());
		System.out.println("ButterScotch".transform(m -> m.toUpperCase()));
		
		System.out.println(" ICE Cream  ".strip().replace(" ", "-"));
		System.out.println(" ICE Cream  ".stripLeading().replace(" ", "-"));
		"FirstLine \n ABC\n XXXY\n LastLine".lines().forEach(System.out::println);
		
		System.out.println("Welcome %s, Your mobile num %d".formatted("Parth",99999999));

	}
	
	
}