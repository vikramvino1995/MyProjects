package org.bank;
//child
public class BankInfo extends AxisBank {
	private void savings() {
		System.out.println("This is Savings Account.");

	}
	private void fixed() {
		System.out.println("This is Fixed Account.");

	}
	public static void main(String[] args) {
		BankInfo bank =new BankInfo();
		System.out.println("INDIAN BANK");
		bank.savings();
		bank.fixed();
		System.out.println("AXIS BANK");
		bank.deposit();
		}
}
