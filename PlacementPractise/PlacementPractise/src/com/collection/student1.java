package com.collection;


public class student1 {
	int id;
	String name;
	student1(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}

}
