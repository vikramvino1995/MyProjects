package org.array;

public class ArrayDescending {
	
	public static void main(String[] args) {
		
		int arr[] = {4,3,7,2,1};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					
					int temp;
					
					temp = arr[i];
					
					arr[i]=arr[j];
					
					arr[j]= temp;
					
				}
				
				
			}
			
			System.out.println(arr[i]);
			
		}
		
		
	}
}
