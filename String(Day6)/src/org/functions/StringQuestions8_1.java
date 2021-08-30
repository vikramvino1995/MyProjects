/*   Description:Get the input from the user and print that word in lowercase

Example:
--------
Input  = VIKRAMVINO
Output = vikramvino          */

package org.functions;

import java.util.Scanner;

public class StringQuestions8_1 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter your String in UpperCase:-");
		String str = s.next();
		String lowerCase = str.toLowerCase();
		System.out.println("\nThis is your String in LowerCase: "+lowerCase);
	}
	
}
