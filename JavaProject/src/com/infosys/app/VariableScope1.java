package com.infosys.app;

//import com.infosys.app.VariableScope1;

public class VariableScope1 {
	int a;
	int b=20;  
	public static void main(String[] args) {
		VariableScope1 v=new VariableScope1();
		v.methodx();
		System.out.println(v.a);

	}
	public void methodx() {
	//int c;
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c); //local variable must be initialise.it doesn't have default value
		
	}

}
/*note:1] we can call global variable inside non static method 
          directly (without creating object) within same class
       2] if we want to call global variable inside static method 
          within the same class or in another class(whether it is static or 
          non static) at that time we have to create object of  the class*/


