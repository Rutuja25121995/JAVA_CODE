package com.tech.fusion;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("abc");
		al.add("pqr");
		al.add(50);
		
	
		System.out.println("using for loop");
		for(int i=0;i<al.size();++i)
		{
        System.out.println(al.get(i));			
		}
		
		
		//Iterator
		System.out.println("----using iterator-------");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}





