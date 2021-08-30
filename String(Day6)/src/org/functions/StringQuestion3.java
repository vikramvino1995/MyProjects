/*
Description: Find the particular character in the given string
   String 1: GreensTechnology 
             print the character h 

   String 2: SeleniumAutomationtool 
             print the character o

   String 3: VikramVino
             print the character m

   String 4: j a v a p r o g r a m 
             print the character p

   String 5: 8148104697
             print the character 7           */

package org.functions;
public class StringQuestion3 {
		public static void main(String[] args) {
			//String 1: GreensTechnology 
			String str1 = "GreensTechnology";
			char charAt1 = str1.charAt(9);
			System.out.println(charAt1);
			
			// String 2: SeleniumAutomationtool 
			String str2 = "SeleniumAutomationtool";
			char charAt2 = str2.charAt(16);
			System.out.println(charAt2);
			
			//String 3: VikramVino
			String str3 = "VikramVino";
			char charAt3 = str3.charAt(5);
			System.out.println(charAt3);
			
			//String 4: j a v a p r o g r a m 
			String str4 = "j a v a p r o g r a m ";
			char charAt4 = str4.charAt(8);
			System.out.println(charAt4);
			
			//String 5: 8148104697
			String str5 = "8148104697";
			char charAt5 = str5.charAt(9);
			System.out.println(charAt5);
						
		}
}
