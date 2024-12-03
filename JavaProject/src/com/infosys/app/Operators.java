package com.infosys.app;

public class Operators {

	public static void main(String[] args) {
		
		System.out.println("**arithematic operators**");
		System.out.println();
		int a=10;
		int b=20;
		System.out.println("addition = "+ a+b);
		System.out.println("substraction = "+ (a-b));
		System.out.println("multiplication = "+ a*b);
		System.out.println("dividion = "+ a/b);
		System.out.println("mod = "+ a%b);
		
		System.out.println("**Unary Operators**");
		
		int x=20;
		int y=30;
		System.out.println(x++);//20
		System.out.println(x);//21
		
		y++;//31
		System.out.println(y++);//31
		System.out.println(y);//32
		
		System.out.println(x--);//21
		System.out.println(x);//20
		
	}

}
