package com.practise;

public class doWhile {

	public static void main(String[] args) {
		int num=1,sum=0;
		do {
			sum=sum+num;
			num++;
		}
		
		while(num<=10);
		System.out.println("addition = "+sum);
	}

}
