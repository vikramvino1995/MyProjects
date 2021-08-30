//try Within try.


package org.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter two Numbers: ");
			int a = s.nextInt();
			int b = s.nextInt();

			try {
				System.out.println(a / b);
			} catch (ArithmeticException ar) {
				System.out.println(ar);
			} finally {
				System.out.println("Arithmetic Exception Handled.");
			}
		} catch (InputMismatchException i) {
			System.out.println(i);
		} finally {
			System.out.println("Input Exception Handled.");
		}
	}
}
