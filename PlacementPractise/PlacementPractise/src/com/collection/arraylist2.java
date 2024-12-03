package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist2 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(20);
		//al.add("rutuja");//can't add string values
		System.out.println(al.size());
		Iterator itr=al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
