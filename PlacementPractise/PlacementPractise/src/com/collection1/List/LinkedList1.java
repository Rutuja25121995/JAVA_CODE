package com.collection1.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(60);
		ll.add("aaaa");
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("----"+ll.get(1));
		System.out.println("--size--"+ll.size());
		Iterator itr=ll.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        System.out.println("-------------------");
        LinkedList<Integer> ll1=new LinkedList(ll);
		ll1.add(50);
		ll1.add(80);
		ll1.add(70);
		ll1.addFirst(100);
		ll1.addLast(110);
		
		//ll1.add("rutuja ");
		
		Iterator itr1=ll1.iterator();
        while(itr1.hasNext()) {
        	System.out.println(itr1.next());
        }
//        ll1.addAll(ll);
//        System.out.println(ll1);
	}

}
