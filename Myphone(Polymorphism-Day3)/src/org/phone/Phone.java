package org.phone;

public class Phone {
		private void phoneInfo(int phone1,long phone2, float phone3) {
			System.out.println("ORDER 1:-");
	     System.out.println("1st:int, 2nd:long , 3rd:float: "+phone1+", "+phone2+", "+phone3);
}
		private void phoneInfo(long phone1,int phone2, float phone3) {
			System.out.println("\nORDER 2:-");
			System.out.println("1st:long, 2nd:int , 3rd:float: "+phone1+", "+phone2+", "+phone3);
		}
		private void phoneInfo( float phone1,int phone2,long phone3) {
			System.out.println("\nORDER 3:-");
			System.out.println("1st:float, 2nd:int , 3rd:long: "+phone1+", "+phone2+", "+phone3);
		}
		public static void main(String[] args) {
			Phone p =new Phone();
			p.phoneInfo(123, 1234567890l, 12345.000f);
			p.phoneInfo(1234567890l, 123 , 12345.000f);
			p.phoneInfo(12345.0000f, 123 ,1234567890l);
		}
}





//You have to overload the method phoneInfo() based on different datatype order in arguments.