package org.exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("id1: 1136");
		System.out.println("id2: 1142");
		String s ="Vikram";
		try {
		int length = s.charAt(7);
		System.out.println(length);
		}
		catch(StringIndexOutOfBoundsException str) {
		System.out.println(str);
		}
		finally {
			System.out.println("String Index Exception Handled.");
		}
		try {
		System.out.println(2/0);
		}
		catch(ArithmeticException a ){
			System.out.println("\n"+a);
		}	
		finally {
			System.out.println("Arithmetic Exception Handled.");
		}
		System.out.println("id3: 1148");
		try {
			String n =null;
			n.indexOf(n);
		}
		catch(NullPointerException e){
			System.out.println("\n"+e);
		}
		finally {
			System.out.println("Null Pointer Exception Handled.");
		}
		
		try {
			int arr[] = {1,2,3,4,5};	
			System.out.println(arr[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException arr) {
			System.out.println("\n"+arr);
		}
		
		finally {
			System.out.println("Array Index Exception Handled" );
		}
		try {
			List<Integer> l =new ArrayList<>();
			l.add(12);
			l.add(15);
			Integer i = l.get(5);
		}
		catch(IndexOutOfBoundsException i) {
			System.out.println("\n"+i);
		}
		finally {
			System.out.println("Index Exception Handled.");
		}
		
	   try {
			String str ="12abc";
		    int parseInt = Integer.parseInt(str);
		    System.out.println(parseInt);
		}
		catch(NumberFormatException n) {
			System.out.println("\n"+n);
		}
		finally {
			System.out.println("Number Format Exception Handled.");
		}
	    
	   try {
		   Scanner sc =new Scanner(System.in);
		   System.out.println("\nEnter Text:");
		   String next = sc.next();
		   System.out.println(next);
		   }
	   
	   catch(InputMismatchException in){
		 System.out.println(in);       
	   }
	   
	   finally {
		   System.out.println("InputMismatch Exception Handled.");
	   }
	   
	}
}
