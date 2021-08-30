package org.autoboxing;

public class DemoClass {
	
	public static void main(String[] args) {
	
		
		//AutoBoxing - primitive datatype to wrapper class
		int a =10;
		
		Integer b = a;
		
		System.out.println(b);
		
		
		float z = 10.23f;
		
		Float z1 = z;
		
		System.out.println(z1);
		
		b = null;
		
		z1= null;
		
		System.out.println(b);
		
		System.out.println(z1);
		
		//Unboxing - Wrapper class to primitive datatype 
		
		Integer in = 12;
		
		int a1= in;
		
	
	}
}
