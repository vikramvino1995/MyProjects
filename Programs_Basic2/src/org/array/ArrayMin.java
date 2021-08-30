package org.array;

public class ArrayMin {

	public static void main(String[] args) {

		int a[] = { 4, 6, 3, 7, 8 };

		int min = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] < min) {

				min = a[i];
			}

		}

		System.out.println("Min number: "+min);

	}
}
