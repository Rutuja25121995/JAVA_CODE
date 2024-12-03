package com.practise.app;

public class StaticVariable {
	
    static int num=20;
    int a=40;
	public static void main(String[] args) {
		
		StaticVariable obj1=new StaticVariable();
		obj1.numberPrint1();
		numberPrint2();

	}
	
	public void numberPrint1()
	{
		System.out.println(num);
		System.out.println(a);
		num=200;
		a=500;
		System.out.println(num);
		System.out.println(a);
	}
	
	public static void numberPrint2() {
		
		StaticVariable obj2=new StaticVariable();
		System.out.println(  num);
		System.out.println(obj2.a);
	}

}
