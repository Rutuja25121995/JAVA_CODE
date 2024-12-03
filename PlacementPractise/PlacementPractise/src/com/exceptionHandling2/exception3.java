package com.exceptionHandling2;

public class exception3 {
	
	public void m2()throws ArithmeticException{
		
		exception2 ee=new exception2();
		try {
			ee.m1();
		} catch (ClassNotFoundException e) {
			System.out.println("exception found");
		}
		int a=10;
		int b=0;
		int c=a/b;
	   System.out.println(c);
	    
	
	}
	
	
		
	
	

}

