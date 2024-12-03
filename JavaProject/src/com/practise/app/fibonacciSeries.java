package com.practise.app;

public class fibonacciSeries {

	public static void main(String[] args) {
		fibo();
	}
	 
	public static void fibo() {
		 int a=0;
		 int b=1;
		 System.out.print(a+" " );
		 System.out.print(b+" ");
		 for(int i=1;i<=10;i++) {
			 int c=a+b;
			 a=b;
			 b=c;
			 System.out.print(c+" ");
		 }
	}

}
