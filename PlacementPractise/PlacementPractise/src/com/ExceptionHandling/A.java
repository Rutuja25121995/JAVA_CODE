package com.ExceptionHandling;

import java.io.FileNotFoundException;

public class A {
	public void m1() throws FileNotFoundException {
		System.out.println("inside class A ");
		try {
			B b=new B();
			b.m1();
			
		} catch (Exception e) {
			System.out.println("end of class A");
			 throw new FileNotFoundException();
		}
		
		
	}

}
