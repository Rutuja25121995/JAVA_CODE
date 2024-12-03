package com.fusion;

public class Kotak implements Bank1{

	String name;
	int age;
	@Override
	public void customerdetails(String name1, int age1) {
		 name=name1;
		 age=age1;
		System.out.println(name);
		System.out.println(age);
	}

	@Override
	public void balance(int balance1) {
		int  balance=balance1;
		System.out.println(balance);
	}
	
	public void withdraw() {
		System.out.println("inside Kotak---withdraw ()");	
	}

	@Override
	public void goldLoan() {
		System.out.println("inside Kotak---goldLoan()");
		
	}
	
}