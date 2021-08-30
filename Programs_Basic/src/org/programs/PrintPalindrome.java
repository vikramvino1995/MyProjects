package org.programs;

public class PrintPalindrome {
	
	public static void main(String[] args) {
		
		for(int number=1;number<=1000;number++) {
			
			int reversed = 0 , i =0 , temp = 0;
			
			temp = number;
			
			while(temp>0) {
				
				i = temp % 10;
				
				reversed = (reversed * 10) + i;
				
				temp= temp/ 10;
				
			if(number == reversed) {
				
					System.out.println(number);
				
			}
				
				
			}
			
		}
		
	}
	
}
