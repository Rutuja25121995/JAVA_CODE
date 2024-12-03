package com.tech;

public class CanaraBank implements Bank, Loan{

	@Override
	public void goldLoan() {
		System.out.println("gold loan from CanaraBank");
	}

	@Override
	public void addCustomer(String fname, String lname) {
		System.out.println("inside CanaraBank-addCustomer");
		
	}

	@Override
	public float checkBalance(int accoutNumber) {
		System.out.println("inside CanaraBank-checkBalance");
		return 0;
	}

	@Override
	public double withdraw(int accountNumber, int amount) {
		System.out.println("inside CanaraBank-withdraw");
		return 0;
	}

}
