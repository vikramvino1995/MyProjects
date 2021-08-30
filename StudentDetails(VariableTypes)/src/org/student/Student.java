package org.student;

public class Student {
		 int a=2;                          //Instance Variable
		 static String b ="Old String.";   //Static Variable 
		
	 private void studentDetails() {
		 
		 System.out.println(a);
		 System.out.println(b);
	}
	 private void student1() {
		
			System.out.println(a);
			System.out.println(b);

	}
	 public static void main(String[] args) {
		Student s =new Student();
		s.a=1;
		b ="New String.";
		s.studentDetails();
		s.student1();
		System.out.println(s.a);
		System.out.println(b);
		
		Student s2= new Student();
		System.out.println(s2.b);
		s2.student1();
		s2.studentDetails();
	 }
}



