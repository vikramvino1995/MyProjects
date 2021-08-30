package org.univ;

public class College extends University {

	@Override
	public void ug() {
		System.out.println("This is UG Degree.");
		
	}

	@Override
	public void pg() {
		System.out.println("This is PG Degree.");
		
	}
	public static void main(String[] args) {
		College degree =new College();
		degree.ug();
		degree.pg();
		degree.declaration();
	}
		
}

//ug(),pg() is just a template in University class and have to override the method ug(),pg() in College class.
