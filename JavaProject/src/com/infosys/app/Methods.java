package com.infosys.app;

public class Methods {

	public static void main(String[] args) {
		addition(4,5);
		
	int sub = substraction(8,4);
	System.out.println(sub);
	
	Methods meth=new Methods();
	double multi=  meth.multiplication(4.1,2.1);
	System.out.println(multi);
	
	String ssss = meth.str("my name is ");
	System.out.println(ssss);
	}
	
	public static void addition(int a,int b) {
		int c=a+b;
		
		System.out.println(c);
		
	}

	public static int substraction(int a,int b) {
		int c=a-b;
		return c; 
	}
	
	public double multiplication(double x,double y) {
		double z=x*y;
		String k=str("hii ");
		System.out.println(k);
		return z;
	}
	public String str(String ss) {
		String st="Rutuja";
		String s=ss+st;
		return s;
	}
	
	
}
