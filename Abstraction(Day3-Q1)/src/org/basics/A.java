package org.basics;

public abstract class A implements I{
	//abstract method.
	 public abstract void clientName();
	 
	 public abstract void clientId();
	 
	 //Non abstract method
	 public void clientLocation() {
		 System.out.println("Client Location: Chennai");
	 }
}
