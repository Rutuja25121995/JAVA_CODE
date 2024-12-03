package com.infosys.app;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		multi();

	}
	public static void multi() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("enter first number");
			int a=sc.nextInt();
			System.out.println("enter second number");
			int b=sc.nextInt();
			System.out.println(a*b);
		}
		
	}

}
