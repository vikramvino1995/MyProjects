package org.programs;

import java.util.Scanner;

public class SwappingWithoutVariable {
	
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter number for a: ");
		
		int a = s.nextInt();
		
		System.out.println("Enter number for b: ");
		
		int b = s.nextInt();
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping: ");
		
		System.out.println("a: "+a);
		
		System.out.println("b :"+b);
		
	}
}
