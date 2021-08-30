package org.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapIteration {
	public static void main(String[] args) {
		Map<Character, String> m = new LinkedHashMap();
		m.put('n', "Vikram");
		m.put('d', "MS Software");
		m.put('c', "VIT University");
		m.put('l', "Chennai");
		m.put('i', "USA");
		m.put('i',"India");         //Same key returns only last value. 
        m.put('a', "Bye");
        m.put('b', "Bye");          //If the values are same both will be printed.
		System.out.println(m);
		
		//entrySet() - to iterate the map.      return type = Set<Entry<k,v>>
		Set<Entry<Character, String>> entrySet1 = m.entrySet();
		
		for(Entry<Character,String> x :entrySet1) {
			System.out.println("\nKey and Value: "+x);  
			//prints key and value.
			
			System.out.println("\nKey Only: "+x.getKey()); 
			// prints key alone.
			
			//getKey() method - available in Entry Interface to get key alone.
			
			System.out.println("\nValue Only: "+x.getValue());
			//prints value alone.
			
			//getvalue() method - available in Entry Interface to get value alone.
			
		}
}
}
