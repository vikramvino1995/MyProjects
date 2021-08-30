package org.string;

public class ReplaceVowelWithSpecialCharacter {
	
	public static void main(String[] args) {
		
		
		//convert the given string to character array
		//calculate the length of string and iterate
		//inside loop , check if charAt(index) == vowels
		//if its a vowel character, assign it with *
		//Outside loop iterate again to print the char array
		
		
		String s ="Welcome to chennai";
		
		char[] charArray = s.toCharArray();
		
		int length = s.length();
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
				
				charArray[i]= '*';
				
			}
			
		}
		
		for(int i=0;i<s.length();i++) {
			
			System.out.print(charArray[i]);
			
		}
		
		System.out.println("\n");
		
		//Regular Expression
		String replacedText = s.replaceAll("[AEIOUaeiou]","*");
		
		System.out.println(replacedText);
		
		
	}
}
