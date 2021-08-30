/* Description : Generate the three literal string and find the identityHashCose()

Example
---------
String 1 : Vikram
String 2 : Vino
String 3 : VikramVino               */

package org.functions;

public class StringQuestion11_4 {
			public static void main(String[] args) {
				String str1 = "Vikram";
				String str2= "Vino";
				String str3= "1136";
				
				int str1memory = System.identityHashCode(str1);
				int str2memory = System.identityHashCode(str2);
				int str3memory = System.identityHashCode(str3);
				
				System.out.println("Memory Allocated for String1: "+str1memory);
				System.out.println("Memory Allocated for String2: "+str2memory);
				System.out.println("Memory Allocated for String3: "+str3memory);
			}
}
