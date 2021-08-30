/* Description:Get the address from the user and verify "pincode" is present or not?
  Example:
------------
Input  = 363/G1,Netaji Nagar,Vengikkal,Tiruvannamalai.
Output = invalid address                       */





package org.functions;

import java.util.Scanner;

public class StringQuestion5_2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your address:-");
		String address = s.nextLine();
		boolean pincode = address.contains("606601");
		System.out.println("\nStatus:"+pincode);
		if(pincode==true)
		{
			System.out.println("\nAbove Address is Valid.");
		}
		else
		{
			System.out.println("\nAbove Address is not Valid.");
		}
		
	}
	

}
