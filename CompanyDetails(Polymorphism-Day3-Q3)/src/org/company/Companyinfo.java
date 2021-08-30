package org.company;

public class Companyinfo {
	private void companyName() {
		System.out.println("No parameter.");
	}

	private void companyName(String cname1) {
		System.out.println("One Parameter: " + cname1);

	}
	private void companyName(String cname2,String cname3) {
		System.out.println("Two parameter: "+cname2+", "+cname3);
	}
	private void companyName(String cname4,String cname5,String cname6) {
		System.out.println("Three parameter: "+cname4+", "+cname5+", "+cname6);
	}
	public static void main(String[] args) {
		Companyinfo c =new Companyinfo();
		c.companyName();
		c.companyName("TCS");
		c.companyName("TCS","CTS");
		c.companyName("TCS","CTS","WIPRO");
	}
	
}





//Different Number of Parameters.