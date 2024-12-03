package com.practise;

import java.util.Scanner;

public class prime2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();
	int temp=0;
	for(int i=2;i<a;i++) {
		if(a%i==0) {
		temp=temp+1;
		break;
		}	
	}
	if(temp==0) {
		System.out.println(a+"is prime no");
	}
	else
		{
		System.out.println(a+"is not prime no");
		}
	}
}
