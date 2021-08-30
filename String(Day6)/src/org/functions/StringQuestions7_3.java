/*Description: Given String as "Welcome to java class" and Replace space into '#'

Example:
----------
input:Welcome to java class
output:Welcome#to#java#class      */


package org.functions;

public class StringQuestions7_3 {
		public static void main(String[] args) {
			String str = "Welcome to java class.";
			System.out.println(str);
			String replace1 = str.replaceAll(" ","#");
			System.out.println("Replaced String: "+replace1);
			
			
			
		}
}
