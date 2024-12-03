package com.company.app;

public class Address {
	int pincode;
	String city;
	
	public Address (int pin,String city){
		this.pincode=pin;
		this.city=city;
	}

	public static void main(String[] args) {
		Address add1=new Address(121222,"NANDED");
		System.out.println(add1.pincode);
		System.out.println(add1.city);

	}

}
