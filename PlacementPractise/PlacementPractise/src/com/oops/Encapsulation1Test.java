package com.oops;

import java.util.Scanner;

public class Encapsulation1Test {
public static void main(String[] args) {
		
		Encapsulation1 en=new Encapsulation1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your account number");
		int accountNumber=sc.nextInt();
		
		System.out.println("enter your name");
		String name=sc.next();
		
		en.setBalance(accountNumber,name);
		System.out.println(en.getBalance());

	
	}
  
}
