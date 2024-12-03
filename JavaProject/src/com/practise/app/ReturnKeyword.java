package com.practise.app;

public class ReturnKeyword {

	public static void main(String[] args) {
		ReturnKeyword obj=new ReturnKeyword();
		System.out.println(obj.add(20,50));

	}
	public static int add(int a,int b) {
		//int a=10; 
		//int b=20;
		int c=a+b;
		System.out.println(c);
		return 2;
		
	}

}
