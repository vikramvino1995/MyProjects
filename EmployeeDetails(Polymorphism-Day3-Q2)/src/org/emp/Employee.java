package org.emp;

public class Employee {
	private void empId() {
		System.out.println("This method does not have parameter.");
}
  private void empId(int id) {
	   System.out.println("This method has one parameter: "+id);
}
  private void empId(int id1,int id2) {
	System.out.println("This method has 2 parameter: "+id1 +", "+id2);
	}
  
  private void empId(float id3,long id4) {
		System.out.println("This method contains different datatypes as parameters: "+id3+", " +id4);
	}
     private void empId(long id5, float id6) {
		System.out.println("This  method contains diff datatypes in diff Order: "+id5+", "+id6);

	}
     
     public static void main(String[] args) {
		Employee e =new Employee();
		e.empId();
		e.empId(1136);
		e.empId(1136,1136);
		e.empId(1136.0f, 113611361136l);
		e.empId(113611361136l,1136.0f);
	}
  
}
