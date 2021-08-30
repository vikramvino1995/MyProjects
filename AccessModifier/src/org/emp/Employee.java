package org.emp;
//With Final
public final class Employee  { 
	     
	public void empId() {
		
		final int a =10;    
	   a =100; //cannot be overrided.
	  
	   System.out.println("After:"+a);
	}
	
	public static void main(String[] args) {
		Employee e =new Employee();
		e.empId();
		e.empId();
	}
}






/*  Final - Class level - cannot inherit the final class
            Method Level - cannot Override that method
            variable     - cannot override that variable.  */
 */