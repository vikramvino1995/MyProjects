// Creating an Exception Class.


package org.exception;

public class EmployeeNotFoundException extends Throwable {
	@Override
	public String getMessage() {
	    
		String msg = "Employee Not Found in Unit 1.";
		return msg;
	}
	
}
