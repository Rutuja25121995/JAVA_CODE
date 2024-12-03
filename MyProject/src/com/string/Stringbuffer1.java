package com.string;

public class Stringbuffer1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("welcome");
		sb.append(" to java");
		System.out.println(sb);
		//System.out.println(sb.reverse());
		for(int i=sb.length()-1;i>=0;i--) {
			System.out.print(sb.charAt(i));
		}

	}

}
