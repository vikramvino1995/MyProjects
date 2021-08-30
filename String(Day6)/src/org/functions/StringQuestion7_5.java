/*  Description:Get the address from the user and verify "pincode" is present or not.
            If present replce the pincode with empty space

Example:
------------
Input  = 5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101
Output = 5-35-2a,venkatesh nivas,Aruppukottai    */


package org.functions;

import java.util.Scanner;

public class StringQuestion7_5 {
			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.println("Enter your address:-");
				String str = s.nextLine();
				System.out.println("\nYour Address is:"+str);
				
				boolean containsPincode = str.contains("pincode-626101");
				
				if(containsPincode==true)
				{
					String replace1 = str.replace(",pincode-626101"," ");
					System.out.println("\nReplaced String:"+replace1);
				}
				else
				{
					System.out.println("\nPincode not available.");
				}
				
			}

}
