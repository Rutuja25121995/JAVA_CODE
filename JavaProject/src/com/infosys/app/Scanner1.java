package com.infosys.app;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("enter the operator(+,-,*,/) to perform operation");

		String input=sc.next();//we can also use sc.nextLine();
		
		scan(a,b,input);
		
	}
	
	public static void scan(int a,int b,String input) {
	
		if(input.equals("+")) {
			System.out.println(a+b);
		}else if(input=="-") {
			System.out.println(a-b);
		}else if(input.equals("*")) {
			System.out.println(a*b);
		}else if(input.equals("/")) {
			System.out.println(a/b);
		}else {
			System.out.println("invalid input");
		}
		
	}

}
