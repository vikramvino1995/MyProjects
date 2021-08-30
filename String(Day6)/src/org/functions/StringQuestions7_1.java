/*  Description:Given string as "Welcome to java class" and replace java into sql.

Example:
-----------
Input  = Welcome to class java
output = Welcome to class sql             */

package org.functions;

public class StringQuestions7_1 {
		public static void main(String[] args) {
			String str = "Welcome to class java.";
			System.out.println(str);
			String replace1 = str.replace("java", "sql");
			System.out.println("\nReplaced String: "+replace1);

			
		}
}
