package com.tech.fusion;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(100);// it will create the size of 100
		
		al.add(10);
		System.out.println(al);
	}
}
// intial capacity  is 100 


// size increase formula --> 3/2 * old capacity
// 10 *3/2 --> 15 
// 15 *3/2 --> 22 
// 22* 3/2--> 33

// it will create the new size when 75% is filled --> (Filled Ration )





