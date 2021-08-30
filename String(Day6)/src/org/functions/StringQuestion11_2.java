/* Description : Generate the two non literal string and find the identityHashCose()

Example
---------
String 1 : Vikram
String 2 : Vikram            */

package org.functions;

public class StringQuestion11_2 {
		public static void main(String[] args) {
				String str1 =new String("Vikram");
				String str2 =new String("Vikram");
				// Different Memory will be Allocated for 2 Strings even if they are same.
				int str1memory = System.identityHashCode(str1);
				int str2memory= System.identityHashCode(str2);
				System.out.println("Memory Allocated for String1: "+str1memory);
				System.out.println("Memory Allocated for String2: "+str2memory);
		}
}
