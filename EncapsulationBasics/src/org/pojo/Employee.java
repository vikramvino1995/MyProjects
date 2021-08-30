package org.pojo;

public class Employee {
	private String name;
	private int id;
	private long mobileNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public void display() {
		System.out.println("\n"+this.id+"\t"+this.name+"\t"+mobileNo);
	}
}


