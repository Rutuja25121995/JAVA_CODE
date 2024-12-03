package com.practise;

public class aa {
	
	
	public static void main(String[] args) {
		method2();
		method3();
	}

	void method1() {
		for(int i=1;i<10;i++) {
			if(i==4) {
			continue;
		    }
			else {
				System.out.println(i);
			}
		}
		
		
	}
	
	static void method2() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void method3() {
		for(int i=1;i<=4;i++) {
			for(int j=4-i;j>=1;j--) {
			System.out.print(" ");
		}
			for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
			System.out.println();
		}
		
	}
}
