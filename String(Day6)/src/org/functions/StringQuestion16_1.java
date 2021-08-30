package org.functions;

public class StringQuestion16_1 {
		public static void main(String[] args) {
			String s= "Welcome";
			for(int i=0;i<=6;i++) {
				char c = s.charAt(i);
				if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
					  String replace0 = s.replaceAll("e","@");
					  String replace = s.replaceAll("o","@");
					  System.out.println(replace0);
				}
				
			}
		}
}
