package com.collection;

import java.util.Iterator;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		person pp=new person("kriti", 10);
		person pp1=new person("Shriya", 12);
		person pp2=new person("shweta", 14);
		
		Vector vv=new Vector();
		
		vv.add(pp);
		vv.add(pp1);
		vv.add(pp2);
		
		Iterator itr=vv.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------------------");
		
		vv.add(pp);
		Iterator itr1=vv.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
	}
}
