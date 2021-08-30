/* Description : Generate the three non literal string and find the identityHashCose()

Example
---------
String 1 : Vikram
String 2 : Vino
String 3 : 1136              */


package org.functions;

public class StringQuestion11_3 {
		public static void main(String[] args) {
				String str1=new String("Vikram");
				String str2=new String("Vino");
				String str3=new String("1136");
				
				int str1memory = System.identityHashCode(str1);
				int str2memory = System.identityHashCode(str2);
				int str3memory= System.identityHashCode(str3);
				
				System.out.println("Memory Allocated for String1:"+str1memory);
				System.out.println("Memory Allocated for String2:"+str2memory);
				System.out.println("Memory Allocated for String3:"+str3memory);
				
			    
				
		}
}
