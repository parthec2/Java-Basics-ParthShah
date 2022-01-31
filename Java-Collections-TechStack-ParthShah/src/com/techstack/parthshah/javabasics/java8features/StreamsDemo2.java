package com.techstack.parthshah.javabasics.java8features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.*;

import com.oracle.webservices.internal.api.message.BasePropertySet;

public class StreamsDemo2 {

	//https://www.youtube.com/watch?v=t1-YZ6bF-g0&ab_channel=JoeJames
	//Java 8 STREAMS Tutorial By-Joe James
	
	public static void main(String[] args) throws IOException {

		String baseFilePath="G:\\Study\\Java\\basics-strong\\Java-Collections\\src\\com\\basicsstrong\\streams\\";
		String dataFilePath = baseFilePath+ "data.txt";
		
		System.out.println("=====Foreach print demo=================================================");
		//Print 1 to 9
		IntStream
			.range(1, 10)
			.forEach(System.out :: println);
	
		System.out.println("=====Skip demo=================================================");
		
		//Skip 1st few elements
		IntStream
			.range(1, 10)
			.skip(5)
			.forEach(x-> System.out.println(x));
		
		System.out.println("======================================================");
		
		System.out.println(IntStream.range(1, 5).sum());
		System.out.println("======================================================");
		
		Stream.of("Parth","Mayur","Pratik")
		.sorted()
		.findFirst().ifPresent(x-> System.out.println(x));//terminal ops
		
		System.out.println("======================================================");
		String[] names= {"Mayur","Pratik","Parth","Bhavin","manu","mohit","Priyansh"};
		Arrays.stream(names) // Arrays.stream OR Streams.of both can be used
		    .map(s-> s.toLowerCase())
			.filter(s->s.startsWith("p"))
			.sorted()
			.forEach(x-> System.out.println(x));
		
		System.out.println("======================================================");
		System.out.println("Stream Sum Ex-: "+IntStream.range(1, 5).sum());
		
		//List<Object> lstObj = new ArrayList<>();
		Object[] lstObj = new Object[5];
		lstObj[0]=new Object[] {"AA",22,33,4.4};
		lstObj[1]=new Object[] {"BB",44,66,6.4};
		lstObj[2]=new Object[] {"cc",88,99,9.4};
		lstObj[3]=new Object[] {"ZZ"};
		lstObj[4]=new Object[] {"DD",99,77};
		
		//map,filter,
		//Arrays.deepToString(lstObj)
		Stream.of(lstObj).forEach(x-> System.out.println(Arrays.toString((Object[]) x)));
		 
		Stream<String> rows=Files.lines(Paths.get(baseFilePath +"data.txt"));
//		int rowCount= (int)rows.map(x->x.split(","))
//		    .filter(x->x.length==3)
//		    .count();
		
		long count = rows.map(x->x.split(",")).filter(m->m.length==3).count();
		rows.close();
		System.out.println("Count of rows which has , -: "+  count);
		//int c= (int)Arrays.stream(lstObj).map(x-> x.split(",")).filter(x -> x.length==3).count();
		
		System.out.println("======================================================"); 
		Stream<String> lines = Files.lines(Paths.get(baseFilePath+ "data.txt"));
		System.out.println("Printing rows whos 1st index is >14 ");
		 lines.map(m->m.split(",")).filter(x->x.length==3).filter(m-> Integer.parseInt(m[1])> 14)
		      .forEach(x-> System.out.println("Rows values are - "+x[0]+"-"+ x[1] +"-"+ x[2]));
		
		lines.close();
		
		System.out.println("======================================================");
		Stream<String> lines2 = Files.lines(Paths.get(dataFilePath));
		
		Map<String,Integer> map2 = new HashMap<String, Integer>();
		map2=lines2.map(m->m.split(",")).filter(x->x.length==3).filter(x-> Integer.parseInt(x[1])>15)
		.collect(Collectors.toMap(x->x[0],x-> Integer.parseInt(x[1]) ));
		
		System.out.println("HashMap values for rows whose 1st index is >12 are");
		for(String key: map2.keySet()) {
			System.out.println(key + "--" + map2.get(key));
		}
		
		lines2.close();
		
		System.out.println("======================================================");
		
		double total= Stream.of(7.3,1.5,4.8)
				      .reduce(0.0,(Double a,Double b)-> a+b);
		System.out.println(total);
		
		System.out.println("====map and flatMap==================================================");
		List<Customer> lstCust = getAll();
		
		//Ex of Map where output is single value(1 to1 mapping)
		List<String> lstEmails = lstCust.stream().map(x->x.getEmail()).collect(Collectors.toList());
		
		 List<List<String>> lstmapPhNumbers = lstCust.stream().map(x->x.getPhoneNumbers()).collect(Collectors.toList());
		 System.out.println("Value of map -List<List<String>> -: ");
		 System.out.println(lstmapPhNumbers);
		 System.out.println("===========================================");
		List<String> lstFlatMapPhNumbers= lstCust.stream().flatMap(x->x.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println("Value of flatMap -List<String> -: ");
		System.out.println(lstFlatMapPhNumbers);
		
		System.out.println("==============mapToDouble Ex========================================");

		String[] s =new String[] {"1","2.4","3.777","4.33"};
		DoubleStream mapToDouble = Stream.of(s).mapToDouble(Double::parseDouble);
		
		double sum = mapToDouble.peek(System.out::println).sum();
		
		System.out.println("mapToDouble sum is -: "+sum);
		
		System.out.println("=======reduce ex===============================================");
		List<Integer> lstNum = Arrays.asList(1,2,3,4,5);
		Integer sumByReduce = lstNum.stream().reduce(0, (a,b) -> a+b);
		Optional<Integer> sumByReduce1 = lstNum.stream().reduce((a,b) -> a+b);
		Integer sumByReduce2 = sumByReduce1.get();
		System.out.println("Sum by reduce method1 -: " + sumByReduce2);
		System.out.println("Sum by reduce method2 -: " + sumByReduce);
		
		Integer mulByReduce = lstNum.stream().reduce(1, (a,b)->a*b);
		System.out.println("Mul by reduce method-: " + mulByReduce);
		
		Integer maxByReduce = lstNum.stream().reduce(1, (a,b)->a>b?a:b);
		System.out.println("Max by reduce method-: " + maxByReduce); 
		
		System.out.println("======================================================");
		
		List<String> words = Arrays.asList("corejava","springboot","Microservices") ;
		String longestWord = words.stream().reduce( (word1,word2)-> word1.length() > word2.length() ? word1: word2 ).get();
		System.out.println("Longest word is -: "+ longestWord );
		System.out.println("======================================================");
	
		double avgEmpSalary = getEmployees().stream()
		  			  .filter(m->m.getGrade().equalsIgnoreCase("A"))//get grade A emp
		  			  .mapToDouble(m->m.getSalary())//convert to double stream
		  			  .average()
		  			  .getAsDouble();
		  			  
		
		double sum2 = getEmployees().stream()
					  .filter(m->m.getGrade().equalsIgnoreCase("A"))
					  .mapToDouble(m->m.getSalary())
					  .sum();
					  
					  
					  
		System.out.println("Using Reduce-Sum of salary is -: "+ sum2 + ", Avg salary is -: "+  avgEmpSalary);
		
		System.out.println("======================================================");
	}

	//get list of customers
	
	public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725")),
                new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());
    }
	
	
	 public static List<Employee> getEmployees(){
	      return  Stream.of(new Employee(101,"john","A",60000),
	              new Employee(109,"peter","B",30000),
	              new Employee(102,"mak","A",80000),
	              new Employee(103,"kim","A",90000),
	              new Employee(104,"json","C",15000))
	              .collect(Collectors.toList());
	    }
	
}//end of class ConstructorReferenceDemo

 class Employee {
    private int id;
    private String name;
    private String grade;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, String grade, double salary) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

 class Customer {

    private int id;
    private String name;
    private String email;
    private List<String> phoneNumbers;

    public Customer() {
    }

    public Customer(int id, String name, String email, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}

