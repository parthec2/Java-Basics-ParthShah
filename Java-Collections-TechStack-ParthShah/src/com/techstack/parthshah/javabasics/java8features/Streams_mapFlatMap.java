package com.techstack.parthshah.javabasics.java8features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.techstack.parthshah.javabasics.models.Cricketer;

public class Streams_mapFlatMap {

	public static void main(String[] args) {
		String baseFilePath="C:\\Users\\ps\\git\\Java-Basics-ParthShah\\Java-Collections-TechStack-ParthShah\\src\\com\\techstack\\parthshah\\javabasics\\java8features\\";
		System.out.println("===================map vs flatMap Demo================================================");
		//map= transformation
		//1 to 1 mapping
		List<Cricketer> cricketers = Factory.getCricketers();
		List<String> collect = cricketers.stream().map(c->c.getName()).collect(Collectors.toList());
		Stream<String> rows;
		try {
			rows = Files.lines(Paths.get(baseFilePath +"data.txt"));
			rows.map(x->x.split(",")[0]).forEach(x->System.out.println(x));
			long count = rows.map(x->x.split(",")).filter(m->m.length==3).count();
			System.out.println("Count of rows which has comma ',' in line -: "+  count);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		System.out.println("=========map demo- 1 to 1 mapping=======================================================");
		System.out.println(collect);
		
		System.out.println("=========What map will return in cas to 1 to many -List<T> =======================================================");
		//cant use map where 1 to many- List<T>,List<String> etc is available as return type
		List<List<String>> collect2 = cricketers.stream().map(c->c.getFormatsPlayed()).collect(Collectors.toList());
		System.out.println(collect2);
		
		//flat map= map(transformation)+data flattening
		//getting List of List- 1 to Mapping 		
		System.out.println("=========flatmap demo-1 to many mapping =======================================================");
		List<String> collect3 = cricketers.stream().flatMap(m->m.getFormatsPlayed().stream()).collect(Collectors.toList());
		System.out.println(collect3);
		
	}
	
	
}//end of class ConstructorReferenceDemo

