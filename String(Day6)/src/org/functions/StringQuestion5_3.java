/* Description:Get the phone number from the user and verify any character is present or not.
               If character is present return as invalid number.
               
Input  = 90954a6o78
Output = False                                               */

package org.functions;

import java.util.Scanner;

public class StringQuestion5_3 {
	public static void main(String[] args) {
               Scanner s = new Scanner(System.in); 
               System.out.println("Enter your Mobile Number:-");
               String phoneno = s.next();
               System.out.println("\nYour Mobile Number is:"+phoneno);
               boolean phone1 = phoneno.contains("a");
               System.out.println("\nStatus for Char1:"+phone1);
               boolean phone2 = phoneno.contains("o");
               System.out.println("\nStatus for Char2:"+phone2);
               
               
              if(phone1==true || phone2==true)
              {
            	  System.out.println("\nThis is Invalid Mobile Number.");
              }
              else
              {
            	  System.out.println("\nThis is a Valid Mobile Number.");
              }
	}
}
