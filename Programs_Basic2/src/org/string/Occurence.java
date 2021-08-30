package org.string;

public class Occurence {

	public static void main(String[] args) {
		
		String input = "AffilIation";
		
		char toFind= 'i';
		
		int occurence = 0;
		
		input = input.toLowerCase();
		
		// With Iteration
		
		for(int i=0;i<input.length();i++) {
			
			if(input.charAt(i)==toFind) {
				
				occurence++;
				
			}
			
		}
		
		System.out.println(toFind + " is present "+ occurence + " no. of times");
		
		
		// With out Iteration
		
		String input2 = "Hello World";
		
		char toFind2 = 'l';
		
		input2 = input2.toLowerCase();
		
		String charToFind = Character.toString(toFind2);
		
		int actualLength = input2.length();
	
		System.out.println("Actual Length: "+actualLength);
		
		 input2 = input2.replaceAll(charToFind,"");
		
		 int lengthAfterReplacing = input2.length();
		 
		 
		 System.out.println("After Length: "+lengthAfterReplacing);
		
		
		 System.out.println(actualLength - lengthAfterReplacing );
		
		 
		
		
	}
}
//Convert inputs into Uniform format
//Find the length of actual input
//replace the toFind Char with empty string
//find the length after replacing
//actual length - replaced length