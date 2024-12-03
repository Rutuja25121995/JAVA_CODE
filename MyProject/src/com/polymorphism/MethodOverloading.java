package com.polymorphism;

public class MethodOverloading {
	
	public void method1() {
		System.out.println("inside m1()--with no parameter");
	}
	
	public int method1(int a) {
		System.out.println("inside m1()--with parameter");
		return a;
	}

	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.method1();
		mo.method1(10);
	}

}
