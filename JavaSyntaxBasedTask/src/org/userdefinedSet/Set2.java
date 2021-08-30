package org.userdefinedSet;
import org.userDefinedList.UserList;
import java.util.Set;
import java.util.LinkedHashSet;

public class Set2 {

	public static void main(String[] args) {
		
		Set<UserList> s =new LinkedHashSet<UserList>();
		
		UserList u =new UserList();
		
		u.setName("bobby");
		u.setMobile(9308475022l);
		u.setSalary(50000.00f);
		
		UserList u1 =new UserList();
		
		u1.setName("Tony");
		u1.setMobile(944213697l);
		u1.setSalary(54321.07f);
		
		s.add(u);
		s.add(u1);
		
		System.out.println(s);
		
		for(UserList x : s) {
			
			System.out.println(x.getName());
			System.out.println(x.getMobile());
			System.out.println(x.getSalary());
		}
		
		
	}
	
}
