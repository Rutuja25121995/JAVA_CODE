package com.infosys.app;

public class Operators2 {

	public static void main(String[] args) {
		int a=30;
		int b=50;
		
		System.out.println("**Relational Operator**");
		
		System.out.println("(a>b) ="+(a>b));
		System.out.println("(a>=b)="+(a>=b));
		System.out.println("(a<b) ="+(a<b));
		System.out.println("(a<=b)="+(a<=b));
		System.out.println("(a==b)="+(a==b));
		System.out.println("(a!=b)="+(a!=b));

		System.out.println("**Bitwise Operator**");
		
		System.out.println("AND="+(a&b));
		
		System.out.println("OR="+(a|b));
		
		System.out.println("XOR="+(a^b));
		
		System.out.println("**Logical Operator**");
		
		System.out.println(a<b && b>a);//both conditions must be true if one condition false result will be false
		System.out.println(a<b && b<a);
		System.out.println(a<b || b<a);//if one condition is true then result will be true.
		
	}

}
