package com.tech.fusion;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();//10
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90); // 10 full
		al.add(100); // new size array
		al.add(110);
		al.add(120);
		
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println("using for loop");
		for(int i=0;i<al.size();++i)
		{
        System.out.println(al.get(i));			
		}
	}
}
// default capacity is 10 
// when the elements intserted more than capicity , it wil created the new array with new size 
// it will copy all the element from old to new arraylist
// and al(reference) point to new array 

// size increase formula --> 3/2 * old capacity
// 10 *3/2 --> 15 
// 15 *3/2 --> 22 
// 22* 3/2--> 33

// it will create the new size when 75% is filled --> (Filled Ration )





