package com.techstack.parthshah.generics;

import java.util.List;

public class DataSorterUpperBounded<T extends Number> {
	
	public List<T> dataSorter;
	
	DataSorterUpperBounded(List<T> dataSorter2){
		this.dataSorter = dataSorter2;
	}

	public void Sort() {
		System.out.println("Before sorting-:");
		System.out.println(dataSorter);
		System.out.println("Ascending Sorting starts-:");
		this.dataSorter.sort(null);
		System.out.println(dataSorter);
	}

	
	
}

 