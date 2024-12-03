package com.practise;

import java.util.Scanner;

public class ifStatement {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter first number");
		    int number1=sc.nextInt();
		    System.out.println("enter second number");
			int number2=sc.nextInt();	
		if(number1>number2) 
		{
			System.out.println(number1+" is greater than "+number2);
		}
		else {
			System.out.println(number2+" is greater than "+number1);
		}

	}

}
