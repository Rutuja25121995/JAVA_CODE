package com.oops;

import java.util.Scanner;

public class Encapsulation1 {
	private int balance=5000;
	private long accountNumber=323333;
	private String name="rutuja";
	
	public int getBalance() {
		
		return balance;
	}
	public void setBalance(long accountNumber,String name) {
		if((this.accountNumber==accountNumber) && (this.name.equals(name)))
		{
			//System.out.println(this.balance);
			this.balance=balance;
			
		}
		else { 
			this.balance=0;
			System.out.println("enter valid credentials");
		}
		
	}
	
	
	
}
