// Example Program for Argument based Constructor.



package org.constructor;

public class ArgumentBasedConstructor {
		
		
		public ArgumentBasedConstructor() {
			System.out.println("Contructor Without Parameter.");
		}
		
		public ArgumentBasedConstructor(int a) {
			System.out.println("Number: "+a);
		}
		
		public ArgumentBasedConstructor(String b, Float c) {
			System.out.println("Name : "+b);
			System.out.println("salary: "+c);
			
		}
		public static void main(String[] args) {
			
			ArgumentBasedConstructor a =new ArgumentBasedConstructor();
			
			System.out.println("\nConstructor With Parameter.");
			
			ArgumentBasedConstructor a1 =new ArgumentBasedConstructor(123);
			
			ArgumentBasedConstructor a2 =new ArgumentBasedConstructor("Vikram",20000.00f);
			
		}
		
		
		 
	
}
