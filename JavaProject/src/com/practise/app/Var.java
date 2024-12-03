package com.practise.app;

public class Var {
    int a;
   int b=10;
	public static void main(String[] args) {
		Var v=new Var();
		v.methodx();
		System.out.println(v.a);
        Var3.abc();
	}
	public void methodx() {
	//int c;
		System.out.println(a);
		//System.out.println(c); //local variable must be initiallise.it doesn't have default value
		
	}

}

 class Var3 {
	
	public static void abc() {
		//System.out.println(a);
		Var3 v1=new Var3();
		v1.methody();
	}
	
	public void methody() {
		Var v=new Var();
		System.out.println(v.a);
		System.out.println(v.b);
	}

}

/*note:1] we can call global variable inside non static method 
          directly (without creating object) within same class
       2] if we want to call global variable inside static method 
          within the same class or in another class(whether it is static or 
          non static) at that time we have to create object of of the class*/
