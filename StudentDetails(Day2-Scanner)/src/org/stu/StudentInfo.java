package org.stu;

import java.util.Scanner;

public class StudentInfo {
	public static void main(String[] args) {
		 Scanner s =new Scanner(System.in);
		 System.out.println("Enter Student Id:-");
		 int studentId = s.nextInt();
		 System.out.println("Your Student Id is: "+studentId);
		 
		 System.out.println("Enter Student Name:-");
		 String studentName = s.next();
		 System.out.println("Your Name is : "+ studentName);
		 
		 System.out.println("Enter Student Email:-");
		 String email = s.next();
		 System.out.println("Your Email-id is: "+email);
		 
		 System.out.println("Enter Student PhoneNo.");
		 Long studentPhone = s.nextLong();
		 System.out.println("Your Phone No. is: "+studentPhone);
		 
		 System.out.println("Enter Student Department");
		 String dept = s.next();
		 System.out.println("Your Department is:"+dept);
		 
		 System.out.println("Enter Student Gender:-");
		 String gender = s.next();
		 System.out.println("Your Gender is: "+gender);
		 
		 System.out.println("Enter Student City:-");
		 String city = s.next();
		 System.out.println("Your City Name is: "+city);
		 
		 
		 
		 
	}

}
