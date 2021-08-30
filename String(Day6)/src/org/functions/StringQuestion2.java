/*Description: Find the particular character index  in the given string.
   String 1: GreensTechnology 
             Find the last index of o     
                  
   String 2: SeleniumAutomationtool 
             Find the index of o
             
   String 3: VikramVino 
             Find the index of n

   String 4: j a v a p r o g r a m 
             Find the last index of  (emptyspace)

   String 5: 8148104697
             Find the last index of 8       */

package org.functions;
public class StringQuestion2 {
		public static void main(String[] args) {
			//String 1 :GreensTechnology
			String str1="GreensTechnology";
			int index1 = str1.lastIndexOf("o");
			System.out.println(index1);
			
			//String 2:SeleniumAutomationTool
			String str2 = "SeleniumAutomationTool";
			int index2 = str2.indexOf("o");
			System.out.println(index2);
			
			//String 3: VikramVino
			String str3 = "VikramVino";
			int index3 = str3.indexOf("n");
			System.out.println(index3);
			
			//String 4: j a v a p r o g r a m 
			String str4 = "j a v a p r o g r a m";
			int index4 = str4.lastIndexOf(" ");
			System.out.println(index4);
			
			//String 5 :8148104697
			String str5= "8148104697";
			int index5 = str5.lastIndexOf("8");
			System.out.println(index5);
			
			}
}
