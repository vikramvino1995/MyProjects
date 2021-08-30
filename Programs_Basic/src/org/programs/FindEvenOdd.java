package org.programs;

import java.util.Scanner;

public class FindEvenOdd {
	
	public static void main(String[] args) {
		
/*		for(int i=0;i<100;i++) {
			if(i%2==0) {
				System.out.println(i+" This is even.");
			}
			else {
				System.out.println(i+" This is Odd.");
			}
			
			
		}*/
		
		
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter Number between 1 and 100: ");
		
		int number = s.nextInt();
		
			if(number%2==0) {
				System.out.println("This is Even.");
			}
			else {
				System.out.println("This is Odd.");
			}
			
		
	}
}
