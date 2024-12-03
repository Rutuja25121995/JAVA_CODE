package com.practise;

public class Result {

	public static void main(String[] args) {
		Samsung sm=new Samsung();
		System.out.println(sm.variable);
		sm.mobiledetails();
		sm.mobiledetails1();
		System.out.println("=========================");
		
		Redmi rd=new Redmi();
		rd.mobiledetails();
		rd.mobiledetails1();
		System.out.println("=========================");
		
	}

}
