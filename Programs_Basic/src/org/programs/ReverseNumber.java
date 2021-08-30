package org.programs;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		
		int number= s.nextInt();
		
		int  i =0, reversed=0;
	
		while (number > 0) {
			
			i = number % 10;
			reversed = (reversed * 10) + i;
			number = number/ 10;
			}
			System.out.println("Reverse number is=" + number);
		
	}
	}

