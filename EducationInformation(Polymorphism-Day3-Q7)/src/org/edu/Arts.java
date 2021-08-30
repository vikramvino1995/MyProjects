package org.edu;

public class Arts extends Education {
	private void bsc() {
		System.out.println("Degree : Bsc");

	}

	private void bbA() {
		System.out.println("Degree : bbA");
	}
	
	@Override
	public void ug() {
		System.out.println("UG : CS(overrided)");
		super.ug();
	}
	@Override
	public void pg() {
		System.out.println("PG : MS(overrided)");
		super.pg();
		
	}
	public static void main(String[] args) {
		Arts a =new Arts();
		a.bbA();
		a.bsc();
		a.ug();
		a.pg();
	}

}
