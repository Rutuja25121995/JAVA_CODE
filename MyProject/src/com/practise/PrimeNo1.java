package com.practise;

import java.util.Scanner;

public class PrimeNo1 {

	public static void main(String[] args) {
		int temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int number=sc.nextInt();
	for(int i=2;i<=number;i++) {
		temp=0;
		for(int j=2;j<i;j++) {
		if(i%j==0) {
			temp=temp+1;
			break;
		     }
		}
		if(temp==0) {
			System.out.println(i+" ");
		}
	}
	
	}

}
