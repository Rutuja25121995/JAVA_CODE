package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(30);//allows duplicate values
		al.add("abc");
		Iterator itr=al.iterator();
		
		while(itr.hasNext()) {
			Object output=itr.next();	
			System.out.println(output);
			System.out.println("after int conversion");
          	Object value=(int)itr.next();	
          	System.out.println(value);
		}
	}

}
