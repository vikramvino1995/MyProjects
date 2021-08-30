package org.edu;
//child
public class Education extends Arts{
	private void ug() {
		System.out.println("This is UG Course");

	}
	private void pg() {
		System.out.println("This is PG Course");

	}
	public static void main(String[] args) {
		Education e =new Education();
		e.ug();
		e.pg();
		System.out.println("ARTS");
		e.bA();
		e.bbA();
		e.bEd();
		e.Bsc();
		System.out.println("ENGINEERING");
		e.bE();
		e.bTech();
		System.out.println("MEDICINE");
		e.physio();
		e.dental();
		e.mbbs();
	}

}
