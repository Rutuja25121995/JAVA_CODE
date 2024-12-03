package com.tech;

public class AxisBank implements Loan, Bank {

	@Override
	public void goldLoan() {
	System.out.println("gold loan from AXIBANK");
		
	}

	@Override
	public void addCustomer(String fname, String lname) {
		System.out.println("inside AxisBank-addCustomer");
		
	}

	@Override
	public float checkBalance(int accoutNumber) {
		System.out.println("inside AxisBank-checkBalance");
		return 0;
	}

	@Override
	public double withdraw(int accountNumber, int amount) {
		System.out.println("inside AxisBank-withdraw");
		return 10;
	}

}
