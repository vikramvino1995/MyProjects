package org.number;

import java.util.Scanner;

public class Number {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number:-");
			int number = s.nextInt();
			
			if(number%2==0)
			{
				System.out.println("Your Number is Even.");
			}
			else
			{
				System.out.println("Your Number is Odd.");
			}
		}
}
