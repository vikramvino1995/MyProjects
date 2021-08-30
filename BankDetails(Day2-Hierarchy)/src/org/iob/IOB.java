package org.iob;

import org.bank.Bank;

public class IOB extends Bank {
         private void accountDetails() {
			System.out.println("This is your Account Details");

		}
         private void branchDetails() {
			System.out.println("This is your Branch Details");

		}
         public static void main(String[] args) {
			IOB child3= new IOB();
			child3.accountDetails();
			child3.branchDetails();
			child3.aadharId();
			child3.panId();
			
			
		}
}

