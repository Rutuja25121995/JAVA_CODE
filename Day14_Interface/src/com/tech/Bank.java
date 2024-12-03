package com.tech;

public interface Bank {
	
	int instrestRate=6;

	void addCustomer(String fname, String lname);
	
	float checkBalance(int accoutNumber);
	
	double withdraw(int accountNumber , int amount);
	
	//void goldloan();
	

}

// canana bank -> 3+ goldloan --> 4 
// axis bank --> 3 + goldloan
// RBIBank  -> 7 -->6
// hdfc --> 8 (+1)
// icic -->9(+2)