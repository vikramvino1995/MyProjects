package org.programs;

//factorial of 6.  (6!)

public class FactorialNumbers {
	
	public static void main(String[] args) {
		
		int count = 1;
		
		for(int i=1;i<7;i++) {
			
			count = count * i;
			
		}
		
		System.out.println(count);
	}
}
