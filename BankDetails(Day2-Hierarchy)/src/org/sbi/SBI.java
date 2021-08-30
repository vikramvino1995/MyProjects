package org.sbi;

import org.bank.Bank;

public class SBI extends Bank {
	private void savings() {
		System.out.println("This is Savings Account.");

	}
	private void deposit() {
		System.out.println("This is Deposit Account");

	}
	public static void main(String[] args) {
		SBI child1= new SBI();
		child1.savings();
		child1.deposit();
		System.out.println("AADHAR and PAN ID is displayed below.");
		child1.aadharId();
		child1.panId();
	}

}
