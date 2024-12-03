package com.collection1.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add("rutuja");
		al.add("prerana");
		System.out.println(al);
		System.out.println("------contains all method-----");
		System.out.println(al.contains(20));
		
		
		ArrayList al1=new ArrayList(al);
		al1.add(40);
		al1.add(20);
		System.out.println(al1.size());
        al1.addAll(al);
        System.out.println("-----add all method------");
        System.out.println(al1);
        System.out.println("-----contains all method------");
        System.out.println(al1.containsAll(al));
        
        
        ArrayList al2=new ArrayList();
        al2.add(111);
        al2.add(222);
        al2.add(333);
        al2.add(444);
        al2.add("aaa");
        System.out.println("------before  remove------");
        System.out.println(al2);
        System.out.println("------after remove------");
        al2.remove(0);
        al2.remove("aaa");//object
        System.out.println(al2);
        
        ArrayList al3=new ArrayList();
        al3.add(444);
        al3.add(333);
        al3.add(777);
        al3.add(888);
        al3.add("bbb");
        al3.removeAll(al2);
        System.out.println("------after remove all------");
        System.out.println(al3);
        
        
        Vector v=new Vector();
        System.out.println(v.capacity());
        v.add(60);
        v.add(70);
        System.out.println(v);
        
        LinkedList ll=new LinkedList();
        //System.out.println(v.capacity());
        ll.add(555);
        ll.add(444);
        //System.out.println(ll);
        Iterator itr=ll.iterator();
        
        while(itr.hasNext())
        {
        	int a=(int)itr.next();
        	
        	if(a==555) {
        		itr.remove();
        		System.out.println("removed");
        		
        	}
        	System.out.println(itr.next());
        }
        
	}

}
