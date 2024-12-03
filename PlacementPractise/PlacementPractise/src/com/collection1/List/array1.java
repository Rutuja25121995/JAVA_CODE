package com.collection1.List;

import java.util.*;

public class array1 {

	public static void main(String[] args) {
		int[] aa={10,20,30};
//		System.out.println(aa[0]);
//		System.out.println(aa[1]);
//		System.out.println(aa[2]);
		
      List l=new ArrayList( );
      l.add(12);
      l.add(20);
      for(Object a:l) {
    	  System.out.println(a);
      }
	}

}
