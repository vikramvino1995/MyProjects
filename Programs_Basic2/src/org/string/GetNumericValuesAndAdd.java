package org.string;

public class GetNumericValuesAndAdd {
	
	public static void main(String[] args) {
		
		String s = "Hello123";
		
		int total =0;
		
		int length =s.length();
		
		for(int i=0;i<s.length();i++) {
			
			char character = s.charAt(i);
			
			if(Character.isDigit(character)) {
				
				total = Character.getNumericValue(character) + total;
				
			}
			
		}
		
		System.out.println(total);
		
	}
}
