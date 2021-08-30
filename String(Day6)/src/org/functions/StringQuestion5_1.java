/*Description: Get the email id from the user and verify '@' is present or not?

Example:
------------
Input  = Vikramvino1136@gmail.com
Output = valid email id                          */


package org.functions;

import java.util.Scanner;

public class StringQuestion5_1 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Email Id:-");
		String str1 = s.next();
		
		boolean contains1 = str1.contains("@");
		System.out.println("\nIs this a valid Email-Id:-");
		
		if(contains1==true)
		{
			System.out.println("\nYes,It is a Valid Email Id.");
		}
		else
		{
			System.out.println("\nNo,It is not a Valid Email Id.");
		}
		
	}

}
