/*  Description:Get the input from the user and print that word in Uppercase

Example:
--------
Input  = vikramvino
Output = VIKRAMVINO          */

package org.functions;

import java.util.Scanner;

public class StringQuestion8_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your String in LowerCase:-");
		String str = s.next();
		String upperCase = str.toUpperCase();
		System.out.println("\nYour String in Upper Case: "+upperCase);
		
	}

}
