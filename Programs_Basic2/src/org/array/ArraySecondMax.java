package org.array;

public class ArraySecondMax {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 4, 8, 5, 2 };

		int max = arr[0];

		int secondMax = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				secondMax = max;

				max = arr[i];

			} else if (arr[i] > secondMax) {

				secondMax = arr[i];

			}

		}

		System.out.println("Max : " + max);

		System.out.println("Second Max:" + secondMax);

	}
}
