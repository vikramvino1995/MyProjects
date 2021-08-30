package org.college;

public class College {
	private void collegeName() {
		System.out.println("College Name : VIT,chennai");

	}
	private void collegeCode() {
		System.out.println("College Code : 001");

	}
	private void collegeRank() {
		System.out.println("College Rank : #8 ");

	}
	public static void main(String[] args) {
		College clg = new College();
		Student stu = new Student();
		Hostel  h = new Hostel();
		Dept d = new Dept();
		System.out.println("_______________STUDENT INFO_____________");
		stu.studentName();
		stu.studentId();
		stu.studentDept();
		System.out.println("_______________COLLEGE DETAILS___________");
		clg.collegeName();
		clg.collegeCode();
		clg.collegeRank();
		System.out.println("_______________HOSTEL___________________");
		h.hostelName();
		System.out.println("_______________DEPARTMENT_______________");
		d.deptName();
		
	}

}
