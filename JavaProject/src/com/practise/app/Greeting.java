package com.practise.app;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String st=sc.next();
//		System.out.println("hello "+st);
		//integerornot();
		 m1();

	}
	public static void integerornot() {
		Scanner sc1=new Scanner(System.in);
		if(sc1.hasNextInt()) {
	    System.out.println("integer");
		}
		else
		{
			System.out.println("not integer");
		}
	
	}
	public static void m1() {
		System.out.println(!(5>4));
	}
	

}
