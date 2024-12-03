package com.practise.app;

public class A {

	public static void main(String[] args) {
		int y=add(2,3);
		System.out.println(y);
		A obj=new A();
		int x=obj.sub(20,10);
		System.out.println(x);

	}
	public static int add(int a, int b)
	{
	/*NOTE:1] when we call non static method from static method
	          then we have to create object of class.
	           
           2] if we call a non static method from multiple static
              methods then we have to create object of class in 
              each static method*/
		
		
		int c=a+b;
		A obj=new A(); //object of class A
		int x=obj.sub(20,10);
		System.out.println(x);
		return c;
	}
	public int sub(int a,int b)
	{
		int d=a-b; //10
		 
		return d;
		
	}
	
	 public static float fl() {
		 float z=3.2f;
		 //System.out.println(z);
		 return z;
		 
	 }
	 
}
