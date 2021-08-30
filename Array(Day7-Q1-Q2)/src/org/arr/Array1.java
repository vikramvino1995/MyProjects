/* Q1

       Description : Write a Java program to sum values of an array
        Input a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        Output   = 55                                    */

/*Q2   Description : Write a Java program to calculate the average value of array elements.
        Input a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        Output   = average = 7.0 		                       */

package org.arr;

public class Array1 {
	public static void main(String[] args) {
			int sum =0;
			float average;
			int a[] = {1,2,3,4,5,6,7,8,9,10};
			
			for(int i=0;i<a.length;i++) {
				sum = sum+i;
			}
			System.out.println("Sum of values in Array: "+sum);
			
			average =  sum/10;
			System.out.println("Average is: "+average);
		}

}
