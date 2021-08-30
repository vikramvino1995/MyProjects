//User Defined Set

package org.pojo;
import java.util.*;

public class Company2 {
	public static void main(String[] args) {
		Set<Employee> s =new LinkedHashSet<>();
		//assigning value
		
		Employee e =new Employee();
		e.setId(1123);
		e.setName("Tom");
		e.setMobileNo(9876521316l);
		
		Employee e2 =new Employee();
		e2.setId(1124);
		e2.setName("Jerry");
		e2.setMobileNo(81234578694l);
		
		//Inserting the Values into Set
		s.add(e);
		s.add(e2);
		
		//Retrieving the Value Using Enhanced For-Loop
		
		System.out.println("Enhanced For-Loop");
		for(Employee x : s) {
			System.out.println(x.getId());
			System.out.println(x.getName());
			System.out.println(x.getMobileNo());
		}
		
		
	}
}
