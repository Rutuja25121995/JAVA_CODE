package com.tech.fusion;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		
		LinkedList ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add("abc");
		ll.add(50);
		
		System.out.println(ll.get(1));
		//System.out.println(ll.get(6));
		ll.remove(6);
		System.out.println(ll);
		
		System.out.println("------------Itertor-----------");
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
