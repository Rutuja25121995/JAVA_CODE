package com.company.operators;

import java.util.Scanner;

public class Operators {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		addition(a,b);
		substraction(50,40);
	
		
	}
	
	public static void addition(int a,int b) {
		int c=a+b;
		System.out.println("addition = "+c);
	}
	
	public static void substraction(int a,int b) {
		System.out.println("substraction = "+(a-b));
	}

}
