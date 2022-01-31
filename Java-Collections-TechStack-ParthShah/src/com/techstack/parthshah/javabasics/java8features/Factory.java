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

public class Factory {

	public static List<Cricketer> getCricketers() {
		List<Cricketer> lstBatsmen = new ArrayList<>();
		
		lstBatsmen.add(new Cricketer("M.S.Dhoni",10773,50.6, Arrays.asList("ODI","TESTS","IPL")));
		lstBatsmen.add(new Cricketer("Virat kohli",12285,58.8, Arrays.asList("ODI","TESTS","IPL")));
		lstBatsmen.add(new Cricketer("Ponting",10100,42 ,Arrays.asList("ODI","TESTS")));
		lstBatsmen.add(new Cricketer("Virendar Sehwag",8273,35.06, Arrays.asList("ODI","TESTS","IPL")));
		lstBatsmen.add(new Cricketer("Joe Root",6109,51.34, Arrays.asList("ODI","TESTS","IPL")));
		lstBatsmen.add(new Cricketer("Chris Gayle",10480,37.7,Arrays.asList("ODI","IPL")));
		
		return lstBatsmen;
	}

}


