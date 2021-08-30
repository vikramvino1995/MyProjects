//User Defined Map.

package org.pojo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Company3 {
	public static void main(String[] args) {
		Map<Float,Employee> m =new LinkedHashMap<>();
		
		//Assigning the Value
		Employee e =new Employee();
		e.setId(1000);
		e.setName("Goku");
		e.setMobileNo(8148104697l);
		
		Employee e2 =new Employee();
		e2.setId(2000);
		e2.setName("Vegeta");
		e2.setMobileNo(9385620896l);
		
		//Inserting the Values into Map.
	     m.put(1.0f, e);
	     m.put(2.0f, e2);
	     
	     //Retrieving the Values from Map.
	     //Enhanced For Loop.
	      Set<Entry<Float, Employee>> a = m.entrySet();
	      
	      for(Entry<Float,Employee> i : a) {
	    	  System.out.println(i.getKey());
	    	  System.out.println(i.getValue().getId());
	    	  System.out.println(i.getValue().getName());
	    	  System.out.println(i.getValue().getMobileNo());
	      }
		
		
	}
}
