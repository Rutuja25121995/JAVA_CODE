package com.infosys.app;

public class StarPattern5 {

	public static void main(String[] args) {
		pattern1();
		pattern2();

	}
	public static void pattern1() {
		int n=5;int m=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i==n/2+1 || j==m/2+1) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("==============");
	}
	
	public static void pattern2() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
