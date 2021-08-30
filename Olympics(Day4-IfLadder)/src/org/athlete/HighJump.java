package org.athlete;

import java.util.Scanner;

public class HighJump {
		public static void main(String[] args) {
			Scanner s =new Scanner(System.in);
			System.out.println("Enter your personal record in Metres:-");
			float height = s.nextFloat();
			
			if(height >= 2.45)
			{
				System.out.println("Congrats!!! You Won Gold Medal");
			}
			else if (height >= 2.30)
			{
				System.out.println("Congrats!!! You Won Silver Medal");
			}
			else if (height >= 2.15)
			{
				System.out.println("Congrats!!! You Won Bronze Medal");
			}
			else
			{
				System.out.println("Sorry, You Lose");
			}
		}
}
