package org.emp;


public class EmployeeInfo {
		public static int a;
		public int b;
			
		public void empDetails() {           //Instance Method
		System.out.println(a);
		System.out.println(b);
		
		a++;    
		b++;     
}
	 	public static void main(String[] args) {  //Static Method
	 		 
			EmployeeInfo e =new EmployeeInfo();
			 e.empDetails();
			//System.out.println(e.b);        
			
			EmployeeInfo e1 = new EmployeeInfo();
			 e1.empDetails();
			//System.out.println(e1.b);        
			
			EmployeeInfo e2 = new EmployeeInfo();
			 e2.empDetails();
			//System.out.println(e2.b);
			
		}

	}

