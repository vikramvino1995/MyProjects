package org.phone;

public class InternalStorage {
	private void processorName() {
		System.out.println("Processor Name : Processor 00#1");

	}
	private void ramsize() {
		System.out.println("RAM Size : 3 GB");

	}
	public static void main(String[] args) {
		InternalStorage i = new InternalStorage();
		ExternalStorage e = new ExternalStorage();
		
		e.size();
		i.processorName();
		i.ramsize();
		
	}

}
