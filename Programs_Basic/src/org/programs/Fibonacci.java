package org.programs;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		
		int a = 0;
		int b = 1;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 0; i <= 10; i++) {
			int c = a + b;
			System.out.println(c);
			//swapping
			a = b;
			b = c;
		
		}
	}
}
