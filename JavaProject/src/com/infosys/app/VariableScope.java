package com.infosys.app;

public class VariableScope {
	int a=20;//Global variable
	static int b=40;
	
	public static void main(String[] args) {
		VariableScope obj=new VariableScope();
		obj.varScope();//a=50 b=40
		obj.varScope();//a=50 b=41
		obj.varScope2() ;
 
	}
	public void varScope() {
		int a=50;  //Local variable
		//static int b=20;
		System.out.println(a+" "+VariableScope.b);//by using class name we can call static variable inside method
	
		b++;// 1st time 41 , 2nd time 42
		a++;//51 
		//System.out.println(a);
	}
	public  void varScope2() {	
		System.out.println(a); //Global value
		System.out.println(b);//42
	  
}
}
