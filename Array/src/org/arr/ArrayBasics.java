package org.arr;

public class ArrayBasics {

	public static void main(String[] args) {
		//Array 1
		int a1[] = new int[6];

		a1[0] = 1;
		a1[1] = 2;
		a1[2] = 3;
		a1[3] = 4;
		a1[4] = 5;
		a1[5] = 6;
		System.out.println("Normal For Loop for Array 1 and Array 2:-");
		System.out.println("\nArray 1:-");
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}	
		//Array  2	
		char a2[] = {'a','b','c','d','e','f','g','h'};
		
		System.out.println("\nArray 2:-");
		
		for(int i=0;i<a2.length;i++) {
			System.out.println(a2[i]);
		}
		System.out.println("\nEnhanced For Loop for Array 3 and Array 4:-");
		//Array 3
		String a3[] = {"Hello","This","Is","Array","In","Java"};
		
		System.out.println("\nArray3 :-");
		
		for(String b:a3) {
			System.out.println(b);
		}
		//Array4
		float a4[]= {1.0f,2.0f,3.0f,4.0f,5.0f,6.0f};
		
		System.out.println("\nArray 4:-");
		
		for(float f:a4) {
			System.out.println(f);
		}
		
	}

}