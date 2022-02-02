package com.techstack.parthshah.javabasics.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import com.techstack.parthshah.javabasics.models.*;

public class FunctionalInterfaceDemo2 {

	public static void main(String[] args) {
		
		List<Book> arryBooks= getAllBooks();
		System.out.println("===Before Sorting-Book Name Order ====================");
		for(Book objBook : arryBooks) {
			System.out.println(objBook.name);
		}
//		System.out.println("Descending Book sorting using class implementing Comparator interface ");
//		Collections.sort(arryBooks, new BookDescSorterComparator());
//		System.out.println("===After Sorting-Descending By Book Name====================");
//		for(Book objBook : arryBooks) {
//			System.out.println(objBook.name);
//		}
//		
		System.out.println("=======================================================");
		System.out.println("Descending Book sorting using lambda expression implementing functional interface- Comparator");
		
		//lambda expression dont have qualifier,name
		Collections.sort(arryBooks, 
					(Book b1,Book b2)->
		    {
		    	return b2.name.compareTo(b1.name); //implementing compare method of comparator Interface
		    }
		);
	
		for(Book objBook : arryBooks) {
			System.out.println(objBook.name);
		}

	}//End of main class
	
	public static List<Book> getAllBooks(){
		ArrayList<Book> lstBooks = new ArrayList<Book>();
		lstBooks.add(new Book(1,"Core Java"));
		lstBooks.add(new Book(2,"Java"));
		lstBooks.add(new Book(3,"Spring Boot"));
		lstBooks.add(new Book(4,"Hibernate"));
		lstBooks.add(new Book(5,"REST API"));
		lstBooks.add(new Book(6,"Zava"));
		
		return lstBooks;
	}

}//end of class FunctionalInterfaceDemo2

//////////////////////////////////////////////////////////////
class BookDescSorterComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		return o2.name.compareTo(o1.name);//desc sorting logic
	}

}
////////////////////////////////////////////////////////////////
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2) {
			return 1;
		}
		if(o1 < o2) {
			return -1;
		}
		return 0;
	}
	
}

class Book {
	public String name;
	public int id;

	public Book(int id2,String name2) {
		this.id=id2;
		this.name=name2;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}


