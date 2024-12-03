package com.tech.fusion;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector vv = new Vector<>();
		vv.add(10);
		vv.add(20);
		vv.add(30);
		vv.add(60);
		vv.add(40);
		vv.add(50);
		vv.add(10);
		vv.add("aaa");
		System.out.println(vv);
		System.out.println("------------Itertor-----------");
		Iterator itr=vv.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
