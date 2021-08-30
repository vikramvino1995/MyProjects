package org.userDefinedMap;
import java.util.Map;
import java.util.Set;
import java.util.Hashtable;
import org.userDefinedList.UserList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

public class Map2 {

	public static void main(String[] args) {
		
		
		Map<Integer,UserList> m =new Hashtable<Integer,UserList>();
		
		UserList u =new UserList();
		
		u.setName("tom");
		u.setMobile(1234567122l);
		u.setSalary(40000.25f);
		
		UserList u1 =new UserList();
		
		u1.setName("jerry");
		u1.setMobile(954321456l);
		u1.setSalary(123000.00f);
		
		
		m.put(1001,u);
		m.put(1002,u1);
		
		
		Set<Integer> keySet = m.keySet();
		
		System.out.println(keySet);
		
		Collection<UserList> c= m.values();
		
		System.out.println(c);
		
		Set<Entry<Integer,UserList>> s2=m.entrySet();
		
		for(Entry<Integer,UserList> x : s2) {
			
			System.out.println(x.getKey());
			
			System.out.println(x.getValue().getName());
			
			System.out.println(x.getValue().getMobile());
			
			System.out.println(x.getValue().getSalary());
				
		}
		
	}
	
}
