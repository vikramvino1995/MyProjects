/*  Description:Convert all small letter and into capital letter


Example:
----------
Input  = WelcomE
Output = wELCOMe          */

package org.functions;

public class StringQuestion8_3 {
		public static void main(String[] args) {
			String str = "WelcomE";
			 for(int i=0;i<=6;i++) {
				 char c = str.charAt(i);
				 System.out.println(c);
				 
				 if(c=='W' || c=='E') {
					 String lowerCase = str.toLowerCase();
					 System.out.println(lowerCase);
				 }
				 else
				 {
					 String upperCase = str.toUpperCase();
					 System.out.println(upperCase);
				 }
				 
			 }
			
			  
			
		}
}
