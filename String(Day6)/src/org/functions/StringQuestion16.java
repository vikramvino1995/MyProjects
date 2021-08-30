/* Description: Replace all vowels char into '@'

Example:
----------
Input  = Welcome
Output = W@lc@m@                    */

package org.functions;

public class StringQuestion16 {
	public static void main(String[] args) {
		String str = "Welcome";
		boolean vowel1 = str.contains("a");
		boolean vowel2 = str.contains("e");
		boolean vowel3 = str.contains("i");
		boolean vowel4 = str.contains("o");
		boolean vowel5 = str.contains("u");

		if (vowel1 == true || vowel2 == true || vowel3 == true || vowel4 == true || vowel5 == true) {
			//String replacedVowel_a = str.replaceAll("a", "@");
			//System.out.println(replacedVowel_a);

			String replacedVowel_e = str.replaceAll("e", "@");
			System.out.println(replacedVowel_e);

			//String replacedVowel_i = str.replaceAll("i", "@");
			//System.out.println(replacedVowel_i);
			
			String replacedVowel_o = str.replaceAll("o", "@");
			System.out.println(replacedVowel_o);
			
			//String replacedVowel_u = str.replaceAll("u", "@");
			//System.out.println(replacedVowel_u);
}
		else
		{
			System.out.println("No Vowels present in the String.");
		}
	}
}
