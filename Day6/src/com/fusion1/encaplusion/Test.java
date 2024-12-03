package com.fusion1.encaplusion;


public class Test {

	public static void main(String[] args) {

		Employee ee = new Employee();
		ee.setId(1);
		ee.setName("aaaa");
		ee.setSalary(1000);
		System.out.println(ee.getId());
		System.out.println(ee.getName());
		System.out.println(ee.getSalary());
		System.out.println("----------------");
		
		Employee ee1= new  Employee();
		ee1.setId(2);
		ee1.setName("bbbbb");
		ee1.setSalary(20000);
		System.out.println(ee1.getId());
		System.out.println(ee1.getName());
		System.out.println(ee1.getSalary());
		System.out.println("----------------");
		
		
	}

}
