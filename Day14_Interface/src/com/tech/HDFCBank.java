package com.tech;

public class HDFCBank implements Bank{


	@Override
	public void addCustomer(String fname, String lname) {
		
		System.out.println("inside HDFCBank-addCustomer");
		System.out.println(fname+lname);
		
	}

	@Override
	public float checkBalance(int accoutNumber) {
		float balance =100000f;
		System.out.println("inside HDFCBank-checkBalance");
		return balance;
	}

	@Override
	public double withdraw(int accountNumber, int amount) {
		double balance = 10000d;
		System.out.println("inside HDFCBank-withdraw");
		double remainingBalance =balance-amount;
		return remainingBalance;
	}
	
	public void printInterestRate()
	{
		// RBI+1
		
		int rate =instrestRate+1;
		System.out.println("Interest rate for hdfc is " +rate);
		
	}
}
