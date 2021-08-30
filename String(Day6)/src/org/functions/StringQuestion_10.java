/*
 Description : Get two input from user and Compare 
Example 1
---------
String 1 :Vikram
String 2 :vikram                                 */


package org.functions;

import java.util.Scanner;

public class StringQuestion_10 {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter first String:");
			String input1 = s.next();
			System.out.println("\nEnter Second String:");
			String input2 = s.next();
			
			System.out.println("\nString1:"+input1);
			System.out.println("\nString2:"+input2);
			 boolean compareString = input1.equals(input2);
			 System.out.println("\nWhether two Strings are the same???   "+compareString);
		}
}
