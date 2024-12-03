package com.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C {
	public void m1() throws FileNotFoundException {
		System.out.println("inside class C ");
		try {
			FileInputStream fis=new FileInputStream("abc.txt");
			
		} catch (Exception e) {
			throw new FileNotFoundException();
		}
		
		
	}

}
