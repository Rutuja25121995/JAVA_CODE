package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap();
		hm.put(1, "rutuja");
		hm.put(2, "riya");
		hm.put(3, "priya");
		hm.put(4, "kriti");
		hm.put(5, "neha");
		hm.put(6, "kriti");
		hm.put(null, null);
		hm.put(null, null);
		System.out.println(hm);
		
		System.out.println("-----printing only keys-----");
		
		Set keys=hm.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----printing only values-----");
		
		Collection values=hm.values();
		Iterator itr1=values.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("-----printing entries-----");
		
		Set<Map.Entry<Integer, String>> entries=hm.entrySet();
        Iterator itr2=entries.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
