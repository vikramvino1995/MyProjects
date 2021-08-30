package org.programs;

import java.util.Scanner;

//swapping numbers with third variable
public class SwappingNumberwithVariable {
	
	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter number for a: ");
		 a = s.nextInt();
		 System.out.println("Enter number for b: ");
		 b = s.nextInt();
		 
		 c= a;
		 a = b;
		 b =c;
		
		 System.out.println("Swapped Numbers: ");
		 System.out.println("a: "+a);
		 System.out.println("b: "+b);
	}
}
