package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
        public static void main(String[] args) {
       car cc=new car("Hyundai",500000);
       car cc1=new car("Kia",1000000);
       car cc2=new car("Ford",1500000);
       
       LinkedList ll=new LinkedList();
       ll.add(cc);
       ll.add(cc1);
       ll.add(cc2);
       ll.addFirst(cc2);
       System.out.println(ll.getFirst());
       Iterator itr=ll.iterator();
       
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
       
       
	
         }
}
