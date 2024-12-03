package com.tech;

public class ICICIBank implements Bank{

	@Override
	public void addCustomer(String fname, String lname) {
		
		System.out.println("inside ICICIBank-addCustomer");
		System.out.println(fname+lname);
	}

	@Override
	public float checkBalance(int accoutNumber) {
		float balance =200000f;
		System.out.println("inside ICICIBank-checkBalance");
	 return balance;
		//return 200000f;
	}

	@Override
	public double withdraw(int accountNumber, int amount) {
		double balance = 20000d;
		System.out.println("inside ICICIBank-withdraw");
		double remainingBalance =balance-amount;
		return remainingBalance;
	}
	
	public void printInterestRateICIC()
	{
		// RBI+2
		int rate =instrestRate+2;
		System.out.println("Interest rate for icic is " +rate);
	}

}
