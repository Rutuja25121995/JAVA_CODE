package com.company.operators;

public class armstrongNumber {

	public static void main(String[] args) {
		int number=153;
		int temp=number;
		//int count=0;
		int result=0;
		
		while(number>0) {
			
			int remainder=number%10;
			
			  result= (int) (result + Math.pow(remainder,3));
			
			number=number/10;
		}
		if(result==temp)
		{ 
			System.out.println("armstrong number");
			
		}
		else {
			System.out.println("not armstrong number");
		}
	}

}
