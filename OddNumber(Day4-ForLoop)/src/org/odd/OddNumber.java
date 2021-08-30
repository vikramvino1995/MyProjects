package org.odd;

public class OddNumber {
	 public static void main(String[] args) {
		 System.out.println("Odd Numbers b/w 1 to100:-");
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
