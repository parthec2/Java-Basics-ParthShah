package com.techstack.parthshah.javabasics.java8features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.techstack.parthshah.javabasics.models.Cricketer;

public class Streams_reduce {

	public static void main(String[] args) {
		String baseFilePath="C:\\Users\\ps\\git\\Java-Basics-ParthShah\\Java-Collections-TechStack-ParthShah\\src\\com\\techstack\\parthshah\\javabasics\\java8features\\";
		System.out.println("===================reduce Demo================================================");
		Stream<String> rows;
		try {
			rows = Files.lines(Paths.get(baseFilePath +"data.txt"));
			long count = rows.map(x->x.split(",")).filter(m->m.length==3).count();
			System.out.println("Total count of rows which has comma ',' in line -: "+  count);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		//range of 1 to 10 as 11 is not inclusive
		IntStream.range(1,11).forEach(x->System.out.println(x));
		int sum = IntStream.range(1, 10).sum();
		System.out.println("Sum of 1 to 10 is -:" + sum );
		
		System.out.println("Multiply of 1 to 10 with reduce fucntion is -: " + IntStream.range(1, 11).reduce(1, (x,y)->x*y));
		System.out.println("Max value between 1 to 10 with reduce is -: " + IntStream.range(1, 10).reduce(Integer::max).getAsInt());
	}
	
	
}//end of class Streams_reduce

