package com.polymorphism;

public class A{
	public static void method1(int a) {
		System.out.println("inside m1() of class A");
	}
}
class B extends A{
	public static void method1(int a) {
		System.out.println("inside m1() of class B");
	}
}