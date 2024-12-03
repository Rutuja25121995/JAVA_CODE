package com.string1;

public class stringmethods {
	public static void main(String[] args) {
		String s="rutuja";
		String s1="rutuja1";
		String ss1="RUTUJA";
		String s2=s.toUpperCase();
		System.out.println(s2);
		
		String s3=s2.toLowerCase();
		System.out.println(s3);
		
		int s4=s3.length();
		System.out.println(s4);
		
		String s5=s3.replace('a','@');
		System.out.println(s5);
		
		String s6=s5.replaceAll("ut", "UT");
		System.out.println(s6);
		
		char s7=s6.charAt(2);
		System.out.println(s7);
		
		String s8=s.substring(3);
		System.out.println(s8);
		
		String s9=s.substring(1,5);
		System.out.println(s9);
		
		String ss="my name is rutuja";
		boolean s10=ss.contains("name is");
		System.out.println(s10);
		
		boolean s11=s.equals(s1);
		System.out.println(s11);
		
		boolean s12=s.equalsIgnoreCase(ss1);
		System.out.println(s12);
		
		int s13=s.indexOf('u',2);
		System.out.println(s13);
	}

}
