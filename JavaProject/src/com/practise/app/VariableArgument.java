package com.practise.app;

public class VariableArgument {

	public static void main(String[] args) {
		VariableArgument obj=new VariableArgument();
		int result=obj.method1(1,2,3,4,7,8);
		System.out.println(result);

	}
	public static int method1(int ...arr) {
		int result=0;
		for(int a:arr) {
		result=result +a; 
		}
		
		return result;
	}

}
