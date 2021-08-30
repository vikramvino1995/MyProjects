package org.basics;

public class C extends A{
	private void cname() {
	
		 System.out.println("Companyname : TCS.");
}
	private void cId() {
		System.out.println("Company Id:1111.");
}
	public static void main(String[] args) {
		C obj =new C();
		
		obj.cname();
		obj.cId();
		obj.clientName();
		obj.clientId();
		obj.clientLocation();
		obj.greeting();
		obj.ename();
		obj.eid();
	}
	@Override
	public void clientName() {
		System.out.println("Client Name: CTS");
		
	}
	@Override
	public void clientId() {
		System.out.println("Client Id: 1112");
		}
	@Override
	public void greeting() {
		System.out.println("Greeting:Hello");
		
	}
	@Override
	public void ename() {
		System.out.println("Ename: Vikram");
		}
	@Override
	public void eid() {
		System.out.println("Eid : 1136");
		
	}
}
