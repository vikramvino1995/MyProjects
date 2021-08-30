package org.string;

import java.util.*;

public class StringCounter {
	
	public static void main(String[] args) {
		
		String s[] = {"Pineapple","Mango","Zenon","Apple","Pineapple","Apple"};
		
		Map<String,Integer> map = new TreeMap<>();
		
		for(String str : s) {
			
			if(map.containsKey(str)) {
				
				map.put(str,map.get(str)+1);
				
			}
			
			else {
				
				map.put(str, 1);
			}
			
		}
		
		System.out.println(map);
			
	}
}
