package com.company.app;

public class Methods {

	public static void main(String[] args) {
		Methods m1=new Methods();
		m1.add();
        m1.add1(20,40);
       System.out.println(m1.substraction(40, 10)); 
       System.out.println(m1.str());
	}
	void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	void add1(int x,int y) {
		System.out.println(x+y);
	}
	
	 int substraction(int a,int b) {
		 int sub=a-b;
		return sub;
	}
	 
	 String str() {
		 
		 return "hello";
	 }

}
