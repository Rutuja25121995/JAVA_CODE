package com.collection1.List;

import java.util.ArrayList;
import java.util.Iterator;

import com.collection.arraylist2;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("10");
		al.add("10");
		al.add("20");
		al.add("aaa");
		al.add(null);
		al.add(null);
		System.out.println(al);
		System.out.println("---------using iterator---------");
		System.out.println("get element by index---"+al.get(2));
		al.add(99);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList al2=new ArrayList(al);
		al2.add("rutuja");
		al2.add("prerana");
		System.out.println(al2);
	}
}
