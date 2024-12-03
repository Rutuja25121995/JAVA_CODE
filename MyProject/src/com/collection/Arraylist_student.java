package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_student {

	public static void main(String[] args) {
		student1 s1=new student1("rutuja", 22);
		student1 s2=new student1("prerana", 23);
		student1 s3=new student1("rakhi", 24);
		
		ArrayList al=new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println(al.get(0));
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		

	}

	
}
