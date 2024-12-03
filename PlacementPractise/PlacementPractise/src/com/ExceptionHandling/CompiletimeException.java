package com.ExceptionHandling;

public class CompiletimeException {

	public static void main(String[] args) {
		A a=new A();
		try {
			a.m1();
			
		} catch (Exception e) {
			System.out.println("exception is handled");
		}

	}

}
