package org.test;

public class A {
	 public A() {
		    this("JAVA");
 		    System.out.println("Default const...");  //4
		  }

		  public A(int id) {
		    this(3456.5678f);
		    System.out.println(id);        //2
		  }

		  public A(String name) {
		    this(12);
		    System.out.println(name);      //3
		  }

		  public A(float sal) {
		    System.out.println(sal);         //1
		  }

		  public static void main(String[] args) {
		    A a = new A();
		  }

		}
