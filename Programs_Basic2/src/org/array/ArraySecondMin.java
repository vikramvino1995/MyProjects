package org.array;

public class ArraySecondMin {

	public static void main(String[] args) {

		int arr[] = {1,3,5,9,10};

		int min = arr[0];

		int secondMin = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {

				secondMin = min;

				min = arr[i];

			} else if (arr[i] < secondMin) {

				secondMin = arr[i];

			}

		}

		System.out.println("Min : " + min);

		System.out.println("Second Min:" + secondMin);

	}
}
