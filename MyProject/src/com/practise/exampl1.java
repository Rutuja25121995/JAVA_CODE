package com.practise;

public class exampl1 {
	
	
		  static int a = 20;
		  exampl1() {
		       a++;
		  }
		 void m1()  {
		       a++;
		       System.out.println(a);
		  }
		public static void main(String[] args) 
		{
			exampl1 obj = new exampl1();
			exampl1 obj2 = new exampl1();
			exampl1 obj3 = new exampl1();
		       obj3.m1();
		   }
		}
	



