package com.tech;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("-------HDFC-CLIENT started--------");
		HDFCBank hd= new HDFCBank();
		System.out.println(hd.instrestRate);
		hd.addCustomer("Fusiontech", "Pune");
		System.out.println(hd.checkBalance(123456));
		System.out.println(hd.withdraw(123456, 1000));
		hd.printInterestRate();
		System.out.println("-------HDFC-CLIENT ended--------");
		
		System.out.println("-------ICICI-CLIENT started--------");
		ICICIBank icic= new ICICIBank();
		System.out.println(icic.instrestRate);
		icic.addCustomer("fusiontech1", "Pune1");
		System.out.println(icic.checkBalance(123456));
		System.out.println(icic.withdraw(123456, 1000));
		icic.printInterestRateICIC();
		
		System.out.println("-------ICICI-CLIENT ended--------");
		
		System.out.println("-------AXIS-CLIENT started--------");
		AxisBank aa= new AxisBank();
		aa.addCustomer("aaa","bb");
		aa.checkBalance(111111);
	System.out.println(	aa.withdraw(1111, 1000));
		aa.goldLoan();
		System.out.println("-------AXIS-CLIENT started--------");
	}

}
