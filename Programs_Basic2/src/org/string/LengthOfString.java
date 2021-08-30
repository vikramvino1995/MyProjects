package org.string;

public class LengthOfString {
	
	public static void main(String[] args) {
		
		// Without Using Length method
		
		String s ="DragonBallZ";
		
		char[] charArray = s.toCharArray();
		
		int length =0;
		for(char c: charArray) {
			
			length++;
			
		}
		
		System.out.println(length);
		
		
	}
}
