package org.student;

public class StudentInfo {

	static String collegeName;
	int rollno;
	String Name;

	private void student1() {
		System.out.println("Student No. 1:-");
		rollno = 100;
		Name = "Vikram";
		collegeName = "VIT University";

	}
	private void student2() {
		System.out.println("Student No. 2:-");
		rollno=101;
		Name = "Vino";
		collegeName = "VIT University";

	}

	public static void main(String[] args) {
            StudentInfo s =new StudentInfo();
            s.student1();
            System.out.println(s.rollno);
            System.out.println(s.Name);
            System.out.println(collegeName);
            
            StudentInfo s2= new StudentInfo();
            System.out.println(s2.rollno);
            System.out.println(s2.Name);
            System.out.println(collegeName);
            
            s.student2();
            System.out.println(s.rollno);
            System.out.println(s.Name);
            System.out.println(collegeName);
	}
}
