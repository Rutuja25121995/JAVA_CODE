package com.practise.app;

public class Funct {

	public static void main(String[] args) {
		int add=add();
		System.out.println(add);
		
		float sub=sub();
		System.out.println(sub);
	}
	
	public static int add()
	{
		int a=2;
		int b=3;
		int c=a+b;
		float x=sub();
		System.out.println(x);
		return c;
	}
	
	
	public static float sub()
	{
		float a=20.1f;
		float b=3.1f;
		float c=a-b;
		return c;
	}

}
