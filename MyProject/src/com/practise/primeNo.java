package com.practise;

import java.util.Scanner;

public class primeNo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int temp;
		for(int i=2;i<=num;i++) {
			temp=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					temp=temp+1;
					break;
				}
			}
			if(temp==0) {
				System.out.println(i);//2,3,5,
			}
		
		}

	}

}
