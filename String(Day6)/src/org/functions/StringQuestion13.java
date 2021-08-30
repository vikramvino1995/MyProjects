/*  Description: Given String as "Welcome to java class" and generate a substring.

Example:
--------
Input :Welcome to java class 
Output:Welcome                               */


package org.functions;

public class StringQuestion13 {
		public static void main(String[] args) {
			String str1= "Welcome to Java Class.";
			String substring1 =str1.substring(0,7);
			String substring2 = str1.substring(8,15);
			String substring3 = str1.substring(16,22);
			String substring0 = str1.substring(0,22);
			
			System.out.println("Your Substring0 is: "+substring0);
			
			System.out.println("Your Substring1 is: "+substring1);
			System.out.println("Your Substring2 is: "+substring2);
			System.out.println("Your Substring3 is: "+substring3);
			
		}
}
