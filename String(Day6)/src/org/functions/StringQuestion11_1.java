/*  Description : Generate the two literal string and find the identityHashCose()
 Example 
---------
String 1 : Vikram
String 2 : Vikram                       */


package org.functions;

public class StringQuestion11_1 {
	public static void main(String[] args) {
			String str1= "Vikram";
			String str2 = "Vikram";
			int str1memory = System.identityHashCode(str1);
			int str2memory = System.identityHashCode(str2);
			
			System.out.println("Memory Allocated for String1: "+str1memory);
			System.out.println("Memory Allocated for String2: "+str2memory);
	}
}
