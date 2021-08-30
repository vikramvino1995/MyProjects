package org.college;
//child
public class Student extends College{
	private void studentName() {
		System.out.println("Student Name : Vikram.A ");

	}
	private void studentId() {
	   System.out.println("Student Id : 13MSE1136");

	}
	private void studentDept() {
		System.out.println("Student Department : Software");

	}
	public static void main(String[] args) {
		Student clg = new Student();
		System.out.println("STUDENT DETAILS");
		clg.studentName();
		clg.studentId();
		clg.studentDept();
		System.out.println("COLLEGE DETAILS");
		clg.collegeName();
		clg.collegeCode();
		clg.collegeRank();
		System.out.println("HOSTEL DETAILS");
		clg.hostelName();
		System.out.println("DEPARTMENT DETAILS");
		clg.deptName();
		
	}
	
}
