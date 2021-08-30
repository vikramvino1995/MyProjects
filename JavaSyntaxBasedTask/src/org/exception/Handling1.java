package org.exception;

import java.util.Scanner;

public class Handling1 {
	
	public static void main(String[] args) {
		
	
		System.out.println("Started");
		Scanner s =new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = s.nextInt();
		System.out.println("Enter number: ");
		int b = s.nextInt();
		
		try {
			
			int c = a/b;
			System.out.println(c);
			
		}
		catch(ArithmeticException ar){
			
			System.out.println(ar);
			
		}
		finally {
			
			System.out.println("Ended.");
		}
		
		
		System.out.println("After Finally");
		
		
	}
}
