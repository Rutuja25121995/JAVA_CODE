package com.tech.fusion;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_Stduent {

	public static void main(String[] args) {

		
		// list of student -- Arraylist -- add(Object e)
		
		Student s1 = new Student(1, "aaa", "aaa@gmail.com");
		Student s2 = new Student(2, "bbb", "bbb@gmail.com");
		Student s3 = new Student(3, "ccc", "ccc@gmail.com");
		ArrayList al = new ArrayList();
		//al.add("aa");
		al.add(s1);
		al.add(s3);
		al.add(s2);
		al.add(s1);
      
		al.remove(1);
		System.out.println(al.get(0));
		
		//System.out.println(al);
         System.out.println("--------iterator -----");
         
         Iterator itr=al.iterator();
         
         while(itr.hasNext())
         {
        	 System.out.println(itr.next());
         }
	

	}
}





