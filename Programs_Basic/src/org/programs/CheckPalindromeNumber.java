package org.programs;

import java.util.Scanner;

public class CheckPalindromeNumber {
	
	public static void main(String[] args) {
		
		
		int number, i , reversed=0;
		
		int temp;  //temporary variable 
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter your Number: ");
		
		number = s.nextInt();
		
		temp = number;
		
		while(temp>0) {
			
			i = temp % 10;
			
			reversed = (reversed * 10) + i;
			
			temp= temp/ 10;
			
		}
		
		if(number == reversed ) {
			
			System.out.println("Number is Palindrome");
			
		}
		else {
			
			System.out.println("Number is not Palindrome");
			
		}
		
	}
}
