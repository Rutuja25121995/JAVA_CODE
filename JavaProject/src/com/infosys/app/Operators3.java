package com.infosys.app;

public class Operators3 {

	public static void main(String[] args) {
		turnaryOperator();
		Operators3 obj=new Operators3();
		int result =obj.assignmentOperators();
		System.out.println(result);
		
		otherOperations();
	}
	
    public static void turnaryOperator() {
    	int marks=57;
    	System.out.println((marks>35 ? "pass" :"fail"));
	
}   
    public int assignmentOperators() {
    System.out.println("======**assignment operators**=====");
    
    int balance=3000;
    balance +=2000;
    return balance;
    
    }
    
    public static void otherOperations() {
    	int a=20;
    	int b=30;int c=40;int d=25;
    	int e=4;int f=54;
    	System.out.println(a -=5); //a=a-5
    	
    	System.out.println(b *=5); //b=b*5
    	System.out.println(c /=5); //c=c/5
    	System.out.println(d %=5); //d=d%5
    	System.out.println(e>>2);  //e=e/2^4=4/4=1
    	System.out.println(f<<3);  //f=f*2^3=54*8=432
    }
}
