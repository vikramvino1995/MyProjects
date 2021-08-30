package org.string;

public class VowelCount {
	
	public static void main(String[] args) {
		
		int vowelCount =0;
		
		String s ="Hello";
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				
				vowelCount++;
				
			}
			
		}
		
		System.out.println(vowelCount);
		
	}
}
