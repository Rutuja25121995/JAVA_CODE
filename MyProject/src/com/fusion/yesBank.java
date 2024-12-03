package com.fusion;

public class yesBank implements Bank1{

	@Override
	public void customerdetails(String name1, int age1) {
		System.out.println("inside yes bank --customerdetails()");
		
	}

	@Override
	public void balance(int balance1) {
		System.out.println("inside yes bank --balance()");
		
	}

	@Override
	public void goldLoan() {
		System.out.println("inside yes bank --goldLoan()");
		
	}

}
