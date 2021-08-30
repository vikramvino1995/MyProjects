package org.collectionsTable;

import java.util.LinkedHashMap;
import java.util.Map;

public class OneDimensionWithHeader {
	
	public static void main(String[] args) {
		
		Map<String,String> m = new LinkedHashMap<>();
		
		m.put("key1","value1");
		m.put("key2","value2");
		m.put("key3","value3");
		m.put("key4","value4");
		m.put("key5","value5");
		m.put("key6","value6");
		m.put("key7","value7");
		
		System.out.println(m);
		
		String value = m.get("key6");
		
		System.out.println(value);
		
		
		// Note : Key acts as the Header.
		
		
		
		
	}
}
