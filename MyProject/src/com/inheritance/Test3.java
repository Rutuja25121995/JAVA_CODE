package com.inheritance;

public class Test3 {


	public static void main(String[] args) {
		b B=new b();
		B.display();
		B.show();

		c C=new c();
		//C.display();
		C.print1();
		C.show();
	}
}
 class a{
	 void show() {
		 System.out.println("inside superclass ---show()");
	 }
 }
  class b extends a{
	  void display() {
		  System.out.println("inside subclass ---display()");
	  }
  }
  class c extends a{
	  void print1() {
		  System.out.println("inside subclass ---print1()");
	  }
  }