package com.ExceptionHandling;

public class RuntimeException {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("cannot divide by zero ");
		}
		finally {
			int d=20;
			int e=30;
			System.out.println(a+b);
		}
		
		

	}

}
