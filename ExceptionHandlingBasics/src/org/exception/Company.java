// throws - handles CompileTimeException and RunTimeException.

package org.exception;

public class Company {
	public static void main(String[] args) throws EmployeeNotFoundException {
		throw new EmployeeNotFoundException();
	}
}
