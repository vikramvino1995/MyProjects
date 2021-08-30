package org.array;

public class StringArrayEquivalent {

	public static void  main(String[] args) {
		
		String word1[] = {"a","bc"};
		
		String word2[] = {"ab","c"};
		
		String firstWord = " ";

		String secondWord = " ";

		for(int i = 0; i < word1.length; i++){

			firstWord = firstWord + word1[i];

		}
		
		for(int i = 0; i < word2.length; i++) {

			secondWord = secondWord + word2[i];

		}
		
		if(firstWord.equals(secondWord)) {
			
			System.out.println("true");
			
		}
		else{
			
			System.out.println("false");
			
		}
	}
	
}
