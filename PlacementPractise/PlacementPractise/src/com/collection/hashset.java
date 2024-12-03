package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(30);// dont allows duplicate values
		hs.add("abc");
		hs.add(30);
		//it prints random values
	    System.out.println(hs);
	    System.out.println("------iterator-----");
	    Iterator itr=hs.iterator();
	    while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	    
	    

	}

}
