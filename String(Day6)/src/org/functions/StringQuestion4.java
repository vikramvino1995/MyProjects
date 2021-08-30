/*
 Description : Get two input from user and check the equality
 			 : print in the output whether it is Equal or not */

package org.functions;

import java.util.Scanner;

public class StringQuestion4 {
			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.println("Enter String 1:-");
				String str1 = s.nextLine();
				System.out.println("String 1 is:"+str1);
				
				System.out.println("\nEnter String 2:-");
				String str2 = s.next();
				System.out.println("String 2 is:"+str2);
				
				//Equals-Case Sensitive
				System.out.println("\nWhether String 1 and 2 are the Same ???");
				boolean equals1 = str1.equals(str2);
				System.out.println("Result for Equals: "+equals1);
				
				//EqualsIgnoreCase - Not Case Sensitive
				boolean equals2 = str1.equalsIgnoreCase(str2);
				System.out.println("Result for EqualsIgnoreCase: "+equals2);
				
				
			}
}
