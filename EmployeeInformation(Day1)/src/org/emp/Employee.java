package org.emp;
import org.company.Company;
import org.client.Client;
import org.project.Project;

public class Employee {
       private void empName() {
		System.out.println("Employee Name : Vikram.A");
}
       public static void main(String[] args) {
    	   System.out.println("___________________________EMPLOYEE INFORMATION_________________");
		Employee e = new Employee();
		e.empName();
		Company c = new Company();
		c.companyName();
		Client cl = new Client();
		cl.clientName();
		Project p = new Project();
		p.projectName();
		
	}
}
