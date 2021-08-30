package org.phone;

public class PhoneInfo {
	 public static void main(String[] args) {
			PhoneInfo model = new PhoneInfo();
			model.phoneName();
			model.phoneMieiNum();
			model.camera();
			model.storage();
			model.osName();
		}
	private void phoneName() {
		
		System.out.println("Mobile Name : Nokia 1100");
   }
	private void phoneMieiNum() {
		System.out.println("num : 023412");

	}
	private void camera() {
		System.out.println("Camera Availability : No camera available");

	}
    private void  storage() {
    	System.out.println("Storage : 128 mb");
    }
    
    private void osName() {
		System.out.println("OS Name : S 30 Series");

	}
    
   
}
