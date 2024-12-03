package com.fusion;

public class test {

	public static void main(String[] args) {
		Kotak kk=new Kotak();
		kk.customerdetails("aaaa", 26);
		System.out.println(kk.name);
		System.out.println(kk.age);
		kk.balance(10000);
		kk.withdraw();
		kk.goldLoan();
		System.out.println("-------------------------------------");
		yesBank yb=new yesBank();
		yb.customerdetails(null, 0);
		yb.balance(0);
		kk.goldLoan();
		System.out.println("-------------------------------------");
		

	}

}
