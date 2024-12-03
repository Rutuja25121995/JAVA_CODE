package com.collection;

public class person {
	String name;
	int id;
	
	public person(String name,int id){
		this.name=name;
		this.id=id;
		
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", id=" + id + "]";
	}
	

}
