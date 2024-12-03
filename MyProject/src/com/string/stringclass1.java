package com.string;

public class stringclass1 {

	public static void main(String[] args) {
		String s1="mumbai";
		String s2="mumbai";
		String s3="pune";
		String s6="PUNE";
		String s7="my name is rutuja";
		boolean s4=s1.equals(s2);
		System.out.println(s4);
		boolean s5=s2.equals(s3);
		System.out.println(s5);
		String[] s8=s7.split(" ",5);
		for(String s:s8)
		{
			System.out.println(s);
		}
		
		//System.out.println(s3.equalsIgnoreCase(s6));
	}

}
