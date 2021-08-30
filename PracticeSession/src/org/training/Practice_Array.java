package org.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice_Array {
	
	public static void main(String[] args) {
		
		
		int[] a = {9,3,2,1,7,5};
	
		Arrays.sort(a);
		
		System.out.println(a);
		
		/*for(int x : a) {
			System.out.println("Sorted : "+ x);
		}*/
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		
		
		int b[] = {5,3,9,2,8};
		
		boolean equals = Arrays.equals(a,b);
		
		if(equals==true) {
			System.out.println("Both arrays are same.");
		}
		else {
			System.out.println("Both arrays are different");
		}
		
		
		int binarySearch = Arrays.binarySearch(a, 9);
		
		System.out.println(binarySearch);
		
		
		
		String[] c =new String[] {"Hello","Vikram","Vino"};

		List<String> asList = Arrays.asList(c);
		
		System.out.println(asList);
	
		
		String string = asList.get(2);
		
		System.out.println(string);
		
		List<String> l =new ArrayList<>();
		
		Collections.addAll(l,c);
		
		System.out.println(l);
		
		l.add("Hi");
		
		l.add("Tool");
		
		System.out.println(l);
		
		String[] c1 = l.toArray(new String[l.size()]);
		
	   System.out.println(c1[3]);
		
		
		
		
	
		
		
		/*List<Integer> asList2 = Arrays.asList(a);
		
		System.out.println(asList2);*/
		
	
		
		
	}
	
	
	
}
