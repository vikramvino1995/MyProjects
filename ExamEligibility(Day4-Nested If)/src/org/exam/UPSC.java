package org.exam;

import java.util.Scanner;

public class UPSC {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Your CSAT Mark:-");
		float csat = s.nextFloat();
		System.out.println("Your CSAT Mark is"+csat);
		
		System.out.println("Enter Your GS Mark:-");
		float generalStudies = s.nextFloat();
		System.out.println("Your GS Mark is: "+generalStudies);
		
		if (csat >= 70)
		{
			if (generalStudies >= 95)
			{
				System.out.println("Congrats!!!You have Cleared Prelims Examination and Qualified for Mains.");
			}
			else
			{
				System.out.println("Sorry! Your General Studies Score is below Cut-Off and you are not Qualified for Mains.");
			}
	
	    }
		else
		{
			System.out.println("Sorry, Your CSAT Score is below 70 and you are not Qualified for Mains");
		}
	}

}
