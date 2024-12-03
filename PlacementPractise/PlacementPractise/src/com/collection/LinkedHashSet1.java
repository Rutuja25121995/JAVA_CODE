package com.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs1=new LinkedHashSet();
		lhs1.add(10);
		lhs1.add(20);
		lhs1.add(30);
		lhs1.add(40);
		lhs1.add(50);
		lhs1.add(30);
		Iterator itr=lhs1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
