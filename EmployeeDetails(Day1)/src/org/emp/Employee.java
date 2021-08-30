package org.emp;

public class Employee {
	
	private void empId() {
		
        System.out.println("Employee Id : 1136" );
	}
	private void empName() {
		
        System.out.println("Employee Name : Vikram");
	}
	private void empDob() {
		
        System.out.println("Date of Birth : 29/09/1995");
	}
	private void empPhone() {
		
		System.out.println("Mobile number : 8148104697");
	}
	private void empEmail() {
		
		System.out.println("Email Id : vikramvino1136@gmail.com");
	}
	private void empAddress() {
		
		System.out.println("Address  : 363/G1,Netaji Nagar, Vengikkal, Tiruvannamalai");
	}
	public static void main(String[] args) {
		Employee empInfo = new Employee();
		empInfo.empId();
		empInfo.empName();
		empInfo.empDob();
		empInfo.empPhone();
		empInfo.empEmail();
		empInfo.empAddress();
		System.out.println("Employee Details Verified !!!");
	}

	
}
