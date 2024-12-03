package com.company.operators;

public class palindrome {

	public static void main(String[] args) {
		int number=12321;
		int result=0;
		int temp=number;
		while(number>0) {
	      int remainder=number%10;
	      result=result*10+remainder;
		   number=number/10;
		}
		if(temp==result) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}
