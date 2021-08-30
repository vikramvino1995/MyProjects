package org.training;

import java.util.HashSet;
import java.util.Set;

public class Practice_Array4 {
	
	public static void main(String[] args) {
		
		//Remove Duplicate Characters
		
		String str1 = "Viikram";
		
		String str2 = "Hello";
		
		char[] letter = str1.toCharArray();
		
		Set<Character> s =new HashSet<>();
		
		for(char x : letter) {
			
			if(s.add(x)) {
				
				System.out.println(x);
				
			}
				
		}
		
		System.out.println("\n");
		
		char[] letter2 = str2.toCharArray();
				
		for(char x : letter2) {
			
			
			if(s.add(x)) {
				
				System.out.println(x);
			}
			
		}
		
		System.out.println(s);
	}
}
