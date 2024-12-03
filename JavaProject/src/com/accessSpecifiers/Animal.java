package com.accessSpecifiers;

public class Animal {
	String name="lizard";
	private String type="reptile";
	

	public static void main(String[] args) {
		Animal obj=new Animal();
		System.out.println(obj.name);
		System.out.println(obj.type);

	}

}
