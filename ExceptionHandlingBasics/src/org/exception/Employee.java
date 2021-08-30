//throw,try,catch

package org.exception;

public class Employee extends Throwable {

private void verify() {
	String str = "1B234";
	if(str.startsWith("1A")){
		System.out.println("Welcome.");
	}
	else {
		try {
			throw new EmployeeNotFoundException();
		} 
		catch (EmployeeNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}

	public static void main(String[] args) {
			Employee e =new Employee();
			e.verify();
			
	}
}
