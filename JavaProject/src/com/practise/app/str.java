package com.practise.app;

public class str {

	public static void main(String[] args) {
		
		System.out.println(sub());
		//System.out.println(add());
	}
	
	public static int add() {
		int a=20;
		int b=30;
		int c=a+b;
		str1();
		return c;
		
	}
	public static int sub() {
		System.out.println(add());
		int x=20;
		int y=30;
		int d=x-y;		
		return d;
	}
	
	
	public static String str1() {
		String st="hello java";
		System.out.println(st);
		return st;
	}

}
