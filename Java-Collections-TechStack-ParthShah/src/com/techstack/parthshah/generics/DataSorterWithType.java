package com.techstack.parthshah.generics;

import java.util.Arrays;
import java.util.List;

public class DataSorterWithType<T> {
	
	public List<T> dataSorter;
	
	DataSorterWithType(List<T> dataSorter2){
		this.dataSorter = dataSorter2;
	}

	public void Sort() {
		this.dataSorter.sort(null);
		
		System.out.println("Ascending Sorting starts-:");
		System.out.println(dataSorter);
		
	}

	
	
}

 