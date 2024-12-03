package com.infosys.app;

public class VariableScope2 {
	
	public static void main(String[] args) {
		//System.out.println(a);
		VariableScope2 v1=new VariableScope2();
		v1.methody();
		VariableScope1 v=new VariableScope1();
		System.out.println(v.b);
	}
	
	public void methody() {
		VariableScope1 v=new VariableScope1();
		System.out.println(v.a);
		
	}

}


