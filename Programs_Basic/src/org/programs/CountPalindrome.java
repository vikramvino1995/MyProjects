package org.programs;

public class CountPalindrome {
	
	public static void main(String[] args) {
		
		int count=0;
		
		for(int number=1;number<=2000;number++) {
			
			int reversed=0 , temp=0 , i = 0;
			
			temp = number;
			
			while(temp>0) {
				
				i = temp % 10;
				
				reversed = (reversed * 10 )+ i;
				
				temp = temp / 10 ;
				
			}
			
			if(number == reversed) {
				
				count++;
				
			}
			
		}
		
		System.out.println(count);
	}
}
