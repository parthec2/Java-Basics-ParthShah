package com.techstack.parthshah.javabasics;

public class EqualsMethod {

	public static void main(String[] args) {

		String s1="AAA";
		String s2="AAA";
		String s3=new String("CC");
		String s4=s3;
		StringBuffer sBuf= new StringBuffer("ZZ");
		StringBuffer sBuf2 = sBuf;
		System.out.println("s1.equals(s2)--" + s1.equals(s2));
		System.out.println("s2 == s3--" + (s2 == s3));
		System.out.println("s1 == s2--" + (s1 == s2));
		System.out.println("s3 == s2--" + (s3 == s4));
		System.out.println("sBuf == sBuf2--" + (sBuf == sBuf2));
	
		//char and double type
		System.out.println("'a' == 97.0--" + ('a' == 97.0));
		
		Thread t = new Thread();
        Object o = new Object();
        String s = new String("GEEKS");
  
        System.out.println(t == o);
        System.out.println(o == s);
  
       // Uncomment to see error 
      // System.out.println(t==s);
		
	}

}
