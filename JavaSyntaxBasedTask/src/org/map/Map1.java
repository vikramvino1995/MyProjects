package org.map;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;
public class Map1 {
	
	public static void main(String[] args) {
			
		Map<Object,String> m =new HashMap<Object,String>();
		
		m.put(101,"vikram");
		m.put(102, "vino");
		m.put(103,"sam");
		m.put(104,"lak");
		m.put(105,"sam");
		
		System.out.println(m);
		
		String s =m.get(101);
		System.out.println(s);
		
		boolean b=m.containsKey(104);
		System.out.println(b);
		
		boolean b1 = m.containsValue("sam");
		System.out.println(b1);
		
		
		Set<Object>s1 =m.keySet();
		
		System.out.println(s1);
		//iterating keys only
		for(Object x : s1) {
			
			System.out.println(x);
			
		}
		
		Collection<String>c = m.values();
		
		System.out.println(c);
		//iterating values only
		for(String x : c) {
			
			System.out.println(x);
			
		}
		
		Set<Entry<Object,String>>set = m.entrySet();
		
		System.out.println(set);
		
		for(Entry<Object,String> set2 : set ) {
			
			System.out.println(set2);
			
			Object o = set2.getKey();
			System.out.println(o);
			
			String value = set2.getValue();
			System.out.println(value);
			
		}
		
	}
}



