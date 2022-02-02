package com.techstack.parthshah.javabasics.java8features;

@FunctionalInterface
interface MyFunctionalInterface{
	
	public int cnt=10;
	public void method1_abs();//SAM-Single Abstract Method
	
	default void method2_default() {
		System.out.println("method2_default Invoked ... ");
	}
	
	static void method3_static() {
		System.out.println("Static method --> method3_static is invoked ...");
	}
	
}

class FunctionalInterfaceImpl implements MyFunctionalInterface {

	@Override
	public void method1_abs() {
		System.out.println("FunctionalInterfaceImpl-> method1_abs is invoked ... ");
		
	}
	
}


public class FunctionalInterfaceDemo  {

	public static void main(String[] args) {
		//In Built-FunctionalInterfaces in java
		//Runnable
		//Comparable<Integer>
		//Comparator<T>
		//Supplier,Predicate,Consumer
	
		System.out.println("==========Legacy way.... ===========================================");
		MyFunctionalInterface i1 = new FunctionalInterfaceImpl();
		i1.method1_abs();//calling SAM method
		
		i1.method2_default();//calling Default method
		
		MyFunctionalInterface.method3_static();//calling static method
		
		
		//System.out.println("==========The Lambda way.... ===========================================");		
		//Implement using lambda expression --> public void method1_abs();
//		MyFunctionalInterface i2 =  
//		() ->
//		{
//			//method body within curly brackets
//			System.out.println("Lambda Impl --> method1_abs is invoked  ... ");
//		};
//		i2.method1_abs();
		
	}

}

