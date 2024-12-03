package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("rutuja");
		ll.add("prerana");
		ll.add("rakhi");
		ll.add("shweta");
		ll.add("sneha");
		ll.add("prerana");//duplicate value
		
		Iterator itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("----iteration using for loop----");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		
	}

}
