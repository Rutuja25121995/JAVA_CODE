package com.exceptionHandling2;

public class exception2 {
	
	public void m1() throws ClassNotFoundException{
		Class.forName("com.fusion.A");
		throw new ClassNotFoundException();
	}

}
