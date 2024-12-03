package com.fusion.encapsulationPackage;

public class EncapsulationClass {
	private int id;
	private String name;
	private int rollNo=23;
	
	
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id<0) {
			this.id=1;
		}else {
			this.id=id;
		}
		
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
