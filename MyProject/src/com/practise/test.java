package com.practise;

public class test {

	public static void main(String[] args) {
		Encapsulation enc=new Encapsulation();
		enc.setName("Kalpana");
		enc.setSalary(20000);
		System.out.println(enc.getName());
		System.out.println(enc.getSalary());
		
		//System.out.println(enc.name);----variable is private

	}

}
