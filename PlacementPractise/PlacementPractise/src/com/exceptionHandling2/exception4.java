package com.exceptionHandling2;

public class exception4 {
	
	public void m4(){
	exception3 ee2=new exception3();
	try {
		ee2.m2();
	
	} catch (ArithmeticException e) {
		System.out.println("inside exception4");
	}
	
	}
}
