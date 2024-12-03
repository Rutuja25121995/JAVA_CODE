package com.pract.constructor;

public class Sum1 {

	public static void main(String[] args) {
		int sq;
		int sum=0;
		for(int i=1;i<=10;i++) {
			sq=i*i;	
			System.out.println(i+"="+sq);
			sum=sum+sq;
			}
		System.out.println("sum="+sum);
		
	}

}
