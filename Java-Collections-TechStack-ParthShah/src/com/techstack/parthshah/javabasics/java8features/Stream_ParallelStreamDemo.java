package com.techstack.parthshah.javabasics.java8features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.*;


public class Stream_ParallelStreamDemo {

	public static void main(String[] args) throws IOException {

		long time1 = System.currentTimeMillis();
		long time2 = System.currentTimeMillis();
		long elapssedTime=0;
		
//		IntStream.range(1, 100).forEach(x-> System.out.println("Thread Name-:"+ Thread.currentThread().getName() +",Seq no-: " +x));
//		time2 = System.currentTimeMillis();
//		
//		 elapssedTime= time2-time1;
//		System.out.println("Time taken by sequential stream is :- "+ elapssedTime);
//		System.out.println("======================================================");
//
//		
//		time1 = System.currentTimeMillis();
//		IntStream.range(1, 100).parallel().forEach(x-> System.out.println("Thread Name-: "+ Thread.currentThread().getName() +", Seq no-: " +x));
//		 time2 = System.currentTimeMillis();
//		 elapssedTime= time2-time1;
//		System.out.println("Time taken by parallel stream is :- "+ elapssedTime);
		System.out.println("======================================================");
//
//
		time1 = System.currentTimeMillis();
		List<Employee> employeesParallelStream = getEmployeesParallelStream();
		 double avgSalarySeq = employeesParallelStream.stream().mapToDouble(i->i.getSalary()).average().getAsDouble();
		 time2 = System.currentTimeMillis();
		 elapssedTime= time2-time1;
		System.out.println("Time by Sequential stream :- "+ elapssedTime + "ms,Avg salary is -:" + avgSalarySeq);
		
		time1 = System.currentTimeMillis();
		double avgSalaryParallel = employeesParallelStream.parallelStream().mapToDouble(j->j.getSalary()).average().getAsDouble();
		time2 = System.currentTimeMillis();
		 elapssedTime= time2-time1;
		System.out.println("Time by Parallel stream :- "+ elapssedTime + "ms,Avg salary is -:" + avgSalaryParallel);
	}

	//get list of customers
	 public static List<Employee> getEmployeesParallelStream(){
		 
		 List<Employee> empLst= new ArrayList<Employee>();
		 
		 for (int i = 0; i < 1000; i++) {
			 empLst.add(new Employee(i,"john"+i,"A",new Random().nextInt(1000*100)));
		}
		 return empLst;
		 
	    }//end of getEmployees
	
}//end of class ConstructorReferenceDemo

