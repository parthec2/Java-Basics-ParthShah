package com.techstack.parthshah.javabasics.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.techstack.parthshah.javabasics.models.Cricketer;

public class HashMap_TreeMap_Demo {

	public static void main(String[] args) {
		Map<String,Cricketer> hMap = new HashMap<String, Cricketer>();
		System.out.println("---Hash Map Demo---------------------------");
		hMap.put("1",new Cricketer("Dhoni", 12000, 55.55));
		hMap.put("2",new Cricketer("Gayle", 10000, 51.55));
		hMap.put("3",new Cricketer("Hudson", 9000, 53.55));
		hMap.put("4",new Cricketer("Gilchrist", 10500, 59.55));
		
		Cricketer cric = hMap.get("4");
		System.out.println(cric);
		hMap.put("4",new Cricketer("Gilchrist", 9500, 60.55));//it will replace as key is same
		 cric = hMap.get("4");
		System.out.println(cric);
		System.out.println("-====================================================================");
		System.out.println("---Tree Map Demo---------------------------");
		Map<String,Cricketer> hTreeMap = new HashMap<String, Cricketer>();
		hTreeMap.put("4",new Cricketer("Gilchrist", 10500, 59.55));
		hTreeMap.put("2",new Cricketer("Gayle", 10000, 51.55));
		hTreeMap.put("1",new Cricketer("Dhoni", 24000, 55.55));
		
		hTreeMap.put("3",new Cricketer("Hudson", 9000, 53.55));
		hTreeMap.put("a",new Cricketer("Sachin", 25000, 53.55));
		hTreeMap.put("A",new Cricketer("Jaysurya", 12500, 53.55));
		hTreeMap.put("b",new Cricketer("Prabhakar", 6500, 52.55));
		hTreeMap.put("B",new Cricketer("Yuvi", 18500, 88.55));
		
		
		cric = hMap.get("4");
		Set<String> keyTreeSet = hTreeMap.keySet();
		System.out.println("Printing TreeSet values-:");
		System.out.println("------------------------------");
		keyTreeSet.forEach(x-> System.out.println(x));
		System.out.println(cric);
		hTreeMap.put("4",new Cricketer("Gilchrist", 9900, 62.55));//it will replace as key is same
		cric = hTreeMap.get("4");
		System.out.println(cric);
		System.out.println("-====================================================================");
		System.out.println("---Tree Map Demo with Navigable features---------------------------");
		
	}

}


