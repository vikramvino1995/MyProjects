package org.collectionsTable;

import java.util.*;

public class TwoDimensionWithHeader {
	
	public static void main(String[] args) {
		
		
		List<HashMap<String,String>> l1 = new LinkedList<HashMap<String,String>>(); 
		
		
		HashMap<String,String> map1 = new HashMap<String,String>();
		
		map1.put("01", "Java");
		map1.put("02","Selenium");
		map1.put("03","Batch");
		
		System.out.println(map1);
		
		
		HashMap<String,String> map2 = new HashMap<String,String>();
		
		map2.put("01","Python");
		map2.put("02","Selenium");
		map2.put("03","Batch");
		
		System.out.println(map2);
		
		HashMap<String,String> map3 = new HashMap<String,String>();
		
		map3.put("01", "C#");
		map3.put("02","Selenium");
		map3.put("03","Batch");
		
		System.out.println(map3);
		
		HashMap<String,String> map4 = new HashMap<String,String>();
		
		map4.put("01", "JavaScript");
		map4.put("02","Selenium");
		map4.put("03","Batch");
		
		System.out.println(map4);
		
	
		l1.add(map1);
		l1.add(map2);
		l1.add(map3);
		l1.add(map4);
		
		
		HashMap<String,String> hashMap = l1.get(3);
		
		
		String tool = hashMap.get("02");
		
		System.out.println("\n"+"ToolName: "+ tool);
		
		String language = hashMap.get("01");
		
		System.out.println("\n"+"Language: "+language);
		
		
		
		
		
		
		
	}
}
