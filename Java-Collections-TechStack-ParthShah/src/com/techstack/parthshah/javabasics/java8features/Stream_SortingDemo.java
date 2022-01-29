package com.techstack.parthshah.javabasics.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.techstack.parthshah.javabasics.models.Cricketer;

public class Stream_SortingDemo {

	public static void main(String[] args) {
		List<Integer> arryLst= new ArrayList<Integer>();
		
		arryLst.add(5);
		arryLst.add(2);
		arryLst.add(15);
		arryLst.add(155);
		arryLst.add(4);
		arryLst.add(25);
		arryLst.add(1);
		System.out.println("Printing list contents...");
		System.out.println(arryLst);
		System.out.println("--------------------------------------------------------");
		System.out.println("Printing list in reverse order from bottom to up...");
		Collections.reverse(arryLst);
		System.out.println(arryLst);
		System.out.println("--------------------------------------------------------");
		Collections.sort(arryLst, new MyCustomComparator());
		System.out.println("Sorted List by descending order...");
		System.out.println(arryLst);
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Sorted List by descending order by Lambda...");
		Collections.sort(arryLst, (o1,o2)-> {
			if(o1>o2) {
				return -1;//desc order,it will not swap values 
			}
			else if(o1<o2) {
				return 1;
			}
			return 0;

		} 
		);
		System.out.println(arryLst);
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Desc sorting= Asc sorting+reverse");
		List<Integer> arryLst2= Arrays.asList(50,2,8,1,9,100);
		System.out.println("Before sorting,array values -: ");
		System.out.println(arryLst2);
		System.out.println("After sorting,array values in desc are -: ");
		Collections.sort(arryLst2);//natural sorting order is asc,
		Collections.reverse(arryLst2);//call reverse method so it will sorted desending order
		System.out.println(arryLst2);
		System.out.println("===========================================================================");
		List<Cricketer> cricketers = Factory.getCricketers();
		System.out.println("Before sorting");
		cricketers.stream().forEach(System.out::println);
		System.out.println("------------------------------------------------------------");
		System.out.println("After sorting Desc by run");
		//Approach-1-using Collections class
		//Collections.sort(cricketers, (c1,c2)-> c2.getRuns()-c1.getRuns());

		//Approach-2 using stream and lambda, +ve value swap value,-ve value dont swap, zero-ignore 
		cricketers.stream().sorted((c1,c2)-> c2.getRuns()- c1.getRuns()).forEach(System.out::println);

		//Approach-3 using stream and Comparator.comparing
		//cricketers.stream().sorted(Comparator.comparing(Cricketer::getRuns).reversed()).forEach(System.out::println);

		System.out.println("=======HashMap Sorting====================================================================");
		HashMap<Cricketer,Integer> hmCricketers = new HashMap<>();
		hmCricketers.put(new Cricketer("M.S.Dhoni",10773,50.6), 10773);
		hmCricketers.put(new Cricketer("Virat kohli",12285,58.8), 12285);
		hmCricketers.put(new Cricketer("Ponting",10100,42), 10100);
		hmCricketers.put(new Cricketer("Virendar Sehwag",8273,35.06), 8273);
		hmCricketers.put(new Cricketer("Joe Root",6109,51.34), 6109);
		
		//iteration of Map using stream and for loop
//		hmCricketers.entrySet().stream().forEach(x -> System.out.println(x.getKey()));
//		for(Map.Entry<Cricketer,Integer> objCric: hmCricketers.entrySet()) {
//			System.out.println("Key- "+ objCric.getKey() + ", Value- "+ objCric.getValue());
//		}
		
		System.out.println("Sorting HashMap desc by key- Cricketer.runs");
		
		//Approach-1 By using normal comparator lambda expression
		hmCricketers.entrySet().stream().sorted((c1,c2)-> c2.getKey().getRuns()-c1.getKey().getRuns()).forEach(System.out::println);
		
		//Approach-2 By using Map.Entry.comparinByKey-- Comparator.comparing
	//  hmCricketers.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Cricketer::getRuns).reversed() ) ).forEach(System.out::println);
		
		System.out.println("====TechStack Demo end=====================================================");
	}
	
	
	
	
}

class MyCustomComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2) {
			return -1;
		}
		else if(o1<o2) {
			return 1;
		}
		return 0;
	}
	
	
}


		

		


