package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet lhs1=new LinkedHashSet();
		lhs1.add(10);
		lhs1.add(20);
		lhs1.add(30);
		lhs1.add(40);
		lhs1.add(50);
		lhs1.add(30);// dont allows duplicate values
		lhs1.add("abc");
		lhs1.add(30);
		//it prints random values
	    //System.out.println(lhs1);
		System.out.println(lhs1.size());
	    System.out.println("------iterator-----");
	    Iterator itr=lhs1.iterator();
	    while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	    

	}

}
