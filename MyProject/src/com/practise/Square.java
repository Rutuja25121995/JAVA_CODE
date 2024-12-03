package com.practise;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
        int number;
		for(int i=1;i<=n;i++) {
		number=i*i;
		System.out.println(i+"*"+i+"="+number);
		}
	}

}
