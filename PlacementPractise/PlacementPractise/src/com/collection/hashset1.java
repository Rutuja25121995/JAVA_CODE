package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset1 {
	public static void main(String[] args) {
		
		StudentHashSET s1=new StudentHashSET(19,"rutuja");
		StudentHashSET s2=new StudentHashSET(20,"rakhi");
		StudentHashSET s3=new StudentHashSET(21,"prerana");
		StudentHashSET s4=new StudentHashSET(22, "shriya");
		student1 st=new student1(33, "rita");
		
		HashSet <Object>hs=new HashSet<Object>();
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(st);
		
		System.out.println(hs);
		Iterator itr=hs.iterator();
	    while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	    System.out.println("-----only StudentHashSET class info------");
	    HashSet <StudentHashSET>hs1=new HashSet<StudentHashSET>();
	    hs1.add(s1);
		hs1.add(s2);
		hs1.add(s3);
		hs1.add(s4);
		//hs1.add(st);//can't add student1 reference
		
		Iterator itr1=hs1.iterator();
		
	    while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
