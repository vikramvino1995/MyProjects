package org.programs;

import java.util.Scanner;

public class CheckPalindromeString {
	
	public static void main(String[] args) {
		
		String original,reversed=""; 
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your Text: ");
		
		original = s.nextLine();
		
		for(int i=original.length()-1;i>=0;i--) {
			
				reversed=reversed+ original.charAt(i);
			
		}
		
		if(original.equals(reversed)) {
			
			System.out.println("PALINDROME");
		}
		else {
			
			System.out.println("NOT PALINDROME");
		}
		
		
	}
}
