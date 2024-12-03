package com.practise.app;

public class StarPattern {

	public static void main(String[] args) {
		method1();
		pattern2();
	}
	public static void method1() {
	
		for(int i=1;i<=4;i++)
		{
			for(int j=4-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) 
			{
			    System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=================");
	}
	public static void pattern2() {
		
			int k=1;
			for(int i=1;i<=4;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(k++ +" ");
				}
				System.out.println();
			}
			
			System.out.println("=================");
		
	}
}
