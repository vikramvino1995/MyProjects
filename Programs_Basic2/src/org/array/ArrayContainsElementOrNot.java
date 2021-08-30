package org.array;

import java.util.Scanner;

public class ArrayContainsElementOrNot {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,4,5,6,8,1};
		
		Scanner s = new Scanner(System.in); 
		
		int value = s.nextInt();
		
		/*for(int x : a) {
			
			if(x==value){
				
				System.out.println("Number Present");
			}
			
		}*/
		
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==value) {
				
				System.out.println("Number Present");
			}
			
			
		}
		
	}
}
