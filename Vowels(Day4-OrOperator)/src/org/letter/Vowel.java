package org.letter;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println(" Enter the Character:-");
		String v = s.next();
		System.out.println(" Your Character is "+v);
		
		
		
	if(v=="a" || v=="e" || v=="i" ||v=="o"||v=="u")
	{
		System.out.println("The Given Char is Vowel.");
	}
	else
	{
		System.out.println("The Given Char is Consonant.");
	}
	
 }	
}
