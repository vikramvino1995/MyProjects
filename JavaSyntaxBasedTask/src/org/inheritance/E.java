package org.inheritance;

public class E implements F,G,H{

	@Override
	public void hmethod() {
		System.out.println("hmethod");
		
	}

	@Override
	public void gmethod1() {
		System.out.println("gmethod");
		
	}

	@Override
	public void fmethod1() {
		System.out.println("fmethod1");
	}

	@Override
	public void fmethod2() {
		System.out.println("fmethod2");
	}
	
	public void emethod() {
		System.out.println("----Emethod-------");
	}

	
	public static void main(String[] args) {
		
		E obj = new E();
		
		obj.fmethod1();
		obj.fmethod2();
		obj.gmethod1();
		obj.hmethod();
		obj.emethod();
		
		
	}
	
}
