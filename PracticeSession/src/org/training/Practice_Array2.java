package org.training;

public class Practice_Array2 {
	
	public static void main(String[] args) {
		
		// Find Duplicates in array
		
		int a[] = {1,2,1,2,3,4,5};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j =i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println("Duplicate Number: "+a[i]);
					
				}
			}
			
		}
		
	}
}
