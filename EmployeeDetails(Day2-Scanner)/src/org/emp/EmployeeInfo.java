package org.emp;
import java.util.Scanner;

public class EmployeeInfo {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
	     System.out.println("Enter Employee Id:-");
		  int id =s.nextInt();
		  System.out.println("Your ID is : " + id);
	      
		  System.out.println("Enter Employee Name :-");
		  String name=s.next();
		  System.out.println("Your Name is: "+name);
		  
		  System.out.println("Enter Employee Email-id:-");
		  String email = s.next();
		  System.out.println("Your Email-id is: "+email );
		  
		  System.out.println("Enter Employee phone no:-");
		  long phone = s.nextLong();
		  System.out.println("Your phone no. is"+phone);
		  
		  System.out.println("Enter Employee Salary:-");
		  float salary = s.nextFloat();
		  System.out.println("Your Salary is:"+salary);
		  
		  System.out.println("Whether Employee's Gender is Male:-");
		  boolean gender=s.nextBoolean();
		  System.out.println("Your Gender is Male: "+gender );
		  
		  System.out.println("Enter Employee City:-");
		  String city = s.next();
		  System.out.println("Your City Name is: "+city);
		  
		  
	}

}
