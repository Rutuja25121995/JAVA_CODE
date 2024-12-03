package com.ExceptionHandling;

import java.io.FileNotFoundException;

public class B {
	public void m1() throws FileNotFoundException {
		System.out.println("inside class B ");
		try {
			C c=new C();
			c.m1();
			
		} catch (Exception e) {
			System.out.println("end of class B");
			throw new FileNotFoundException();
		}
		
		
	}

}
