package com.practise1.encapsulation;

public class testEmployee {

	public static void main(String[] args) {
		Employee ee=new Employee();
		ee.setSalary(100022);
		ee.setName("rutuja");
		
		System.out.println(ee.getName());
		System.out.println(ee.getSalary());
		
		ee.setSalary(200000);
		ee.setName("prerana");
		
		System.out.println(ee.getName());
		System.out.println(ee.getSalary());

	}

}
