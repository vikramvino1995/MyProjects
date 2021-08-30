/*  
Example1:  Given String as "Welcome to java class" and verify whether the given string startsWith welcome.
-----------
Input  = Welcome to class java
output = True                                                   */
package org.functions;
public class StringQuestion9_1 {
			public static void main(String[] args) {
				String str = "Welcome to Class Java.";
				boolean startsWith1 = str.startsWith("Welcome");
				System.out.println("Example1: "+startsWith1);		
				
/* Example2: Given String as "Hi I am Vikram" and verify whether the given string startsWith welcome. 
-----------
Input  = Hi I am Vikram.
output = False                                                              */				
				String str2= "Hi I am Vikram.";
				boolean startsWith2 = str2.startsWith("Welcome");
				System.out.println("Example2: "+startsWith2);		
				
/*  Example3:  Given String as "Welcome to java class" and verify whether the given string endsWith class.
-----------
Input  = Welcome to java class
output = True				                     */
				String str3 ="Welcome to java class";
				boolean endsWith1 = str3.endsWith("class");
				System.out.println("Example3:"+endsWith1);
				
/* Example4:  Given String as "Welcome to java class" and verify whether the given string endsWith java.
-----------
Input  = Welcome to java class
output = False                                                 */
				String str4 = "Welcome to java class";
				boolean endsWith2 = str4.endsWith("java");
				System.out.println("Example4:"+endsWith2);
				
/* Example5: Given String as "Welcome to java class" and verify whether the string is empty or not.
-----------
Input  = Welcome to java class
output = False                                                          */
				String str5 = "Welcome to java Class";
				boolean empty1 = str5.isEmpty();
				System.out.println("Example5:"+empty1);

/* Example:    Given String as "" and verify whether the string is empty or not
-----------
Input  = ""
Output = False                                     */
				String str6 = "";
				boolean empty2 = str6.isEmpty();
				System.out.println("Example6:"+empty2);
					
			}
}
