/*   Description:Get the phonenumber from the user  .
            If phonenumber exceeds greater than 10 then return invalid number

Example:
--------
Input  = 89034256972365
output = invalid
Example 2:
---------
Input  = 9095484678
Output = valid                         */


package org.functions;

import java.util.Scanner;

public class StringQuestion6 {
            public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				
				System.out.println("Enter your Phone Number:-");
				String phone1 = s.next();
				
				System.out.println("\nYour Mobile Number is:"+phone1);
				int numberLength = phone1.length();
				
				if(numberLength>10)
				{
					System.out.println("\nInvalid Mobile Number....");
				}
				else
				{
					System.out.println("\nValid Mobile Number....");
				}
				
			}
}
