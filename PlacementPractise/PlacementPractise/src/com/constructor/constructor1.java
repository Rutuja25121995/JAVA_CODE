package com.constructor;

public class constructor1 {
	public constructor1(long b){
    	System.out.println(b+"inside 2nd constructor");
	}
	
	public constructor1(int a){
		System.out.println(a+"inside first constructor");
	}
      public void m1(long b,double a) {
    	  System.out.println("inside long 1st");
      }

      public void m1(int b, long a) {
    	  System.out.println("inside int 1st");
      }
	public static void main(String[] args) {
		constructor1 c=new constructor1(10);
		c.m1(10,20);

	}

}
