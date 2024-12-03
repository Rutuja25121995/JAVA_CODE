package com.collection;

import java.util.ArrayList;

public class Arraylist1 {
	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add("xyz");
		System.out.println(ar);
		System.out.println("---------------------------");
		System.out.println("size of arraylist = "+ar.size());
		System.out.println("---------------------------");
		System.out.println("printing array by using for loop");
		for(int i=0;i<ar.size();i++) 
		{
			System.out.println(ar.get(i));
		}
	}

}
