package com.practise;

import java.util.Scanner;

public class ifElseIf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks");
		int marks=sc.nextInt();
		
		if(marks>75) 
		{
			System.out.println("your marks are greater than 75");
		}else if(marks>35 && marks<75)
		{
			System.out.println("you are pass");
		}else {
			System.out.println("you are fail");
		}

	}

}
