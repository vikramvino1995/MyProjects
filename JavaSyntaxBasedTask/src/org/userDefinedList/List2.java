package org.userDefinedList;
import java.util.List;
import java.util.LinkedList;

public class List2 {
		
	public static void main(String[]args) {
		
	List<UserList> l = new LinkedList<UserList>();
	
	UserList u =new UserList();
	
	u.setName("Vikram");
	u.setMobile(8148104697l);
	u.setSalary(20000.50f);
	
	
	UserList u1 = new UserList();
	
	u1.setName("Vino");
	u1.setMobile(9385620896l);
	u1.setSalary(30000.00f);
	
	l.add(u);
	l.add(u1);
	
	UserList ul= l.get(0);
	
	String s = ul.getName();
	long l1 =ul.getMobile();
	float f= ul.getSalary();

	System.out.println(s);
	System.out.println(l1);
	System.out.println(f);
	
	
	for(int i=0;i<l.size();i++) {
		
		System.out.println(l.get(i).getName());
		System.out.println(l.get(i).getMobile());
		System.out.println(l.get(i).getSalary());
		
		
	}
	
	}
}
