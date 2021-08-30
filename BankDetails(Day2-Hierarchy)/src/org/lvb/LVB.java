package org.lvb;

import org.bank.Bank;

public class LVB extends Bank{
	 private void current() {
		 System.out.println("This is current Account");
		
	 }
	 private void fixed() {
		System.out.println("This is fixed Account");

	}
	 
	 public static void main(String[] args) {
		LVB child2 = new LVB();
		child2.current();
		child2.fixed();
		child2.aadharId();
		child2.panId();
	}

}
