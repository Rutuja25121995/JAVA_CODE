package com.collection;

public class student1 {
	int rollno;
	String name;
	
	public student1(String name,int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	@Override
	public String toString() {
		return "student--->name=" + name + ", rollno=" + rollno+ "";
	}


}
