package org.training;

import java.util.HashSet;
import java.util.Set;

public class Practice_Array3 {
	
	public static void main(String[] args) {
		
		// Integer Array
		
		int a[]= {1,2,1,2,3,4};
		
		Set<Integer> s =new HashSet<>();
		
		//  find and Remove Duplicates
		
		for(int x : a) {
	
			if(s.add(x)) {
				
				System.out.println(x);
			}
						
		}
		
		System.out.println(s);
		
		
		//find and print Only Duplicates
		
		int b[]= {5,5,6,6,77,88,99,77};
		
		Set<Integer> s1 =new HashSet<>();
		
		for(int x : b) {
			
			if(!s1.add(x)) {
				
				System.out.println("Duplicates: "+x);
			}
		}
		
		System.out.println(s1);
	}
}
