/*Description:Get the email from the user and verify "gmail" is present or not.
            If present replace that gmail into yahoo

Example:
------------
Input  = Vikramvino1136@gmail.com
Output = Vikramvino1136@yahoo.com               */


package org.functions;

import java.util.Scanner;

public class StringQuestion7_4 {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter your Mail-Id:-");
			String str = s.next();  //user input
			System.out.println("\nYour Email-id is:"+str);
			
			boolean containsGmail = str.contains("gmail");
			
			if(containsGmail==true)
			{
				String replace = str.replace("gmail", "yahoo");
				System.out.println("\nReplaced String:"+replace);
			}
			else
			{
				System.out.println("\nThis is not gmail account.");
			}
			
	}
}
