package com.company.operators;

public class fabonacciSeries {

	public static void main(String[] args) {

		int num3,num4,num1=0,num2=1;
		System.out.println(num1);
		System.out.println(num2);
		  for(int i=2;i<=10;i++) {
			 num3=num1+num2;
			  System.out.println(num3);
			  num1=num2;
			  num2=num3;
					 
		  }
	}

}
