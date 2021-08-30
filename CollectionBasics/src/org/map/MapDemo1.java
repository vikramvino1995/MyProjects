package org.map;

import java.util.Collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1 {
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

		// get() method - returns the value of that specified key.
		String name = m.get('n');
		System.out.println("\nYour Name is: " + name);

		// containsKey() - to check whether particular key is present or not.
		boolean containsKey1 = m.containsKey('l');
		System.out.println("\nWhether this Map has key 'l': " + containsKey1);
			
		//containsValue() - to check whether particular value is present or not.
		boolean containsValue1 = m.containsValue("Hello");
		System.out.println("\nWhether this Map has  Value as Hello: "+containsValue1);
		
		//keySet() - to print only the keys in a map.  return type - set<>.
		Set<Character> onlyKeys = m.keySet();
		System.out.println("\nKeys in Map: "+onlyKeys);
		
		//values() - to print only the values in a map. return type - Collection<>.
		Collection<String> onlyValues = m.values();
		System.out.println("\nOnly Values in Map: "+onlyValues);
		
		
		//clear() - to remove all keys and values from map.
		m.clear();
		System.out.println("\nCleared Map: "+m);
		

			
	}
}
