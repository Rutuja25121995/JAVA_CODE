package com.practise.app;

public class MethodOverloading {

	public static void main(String[] args) {
		method1();
		method1("hey how are you");
		method1(2,3);
		
		int x=555;
		method2(111);
		//System.out.println(x=method2(111));
		System.out.println(x);
		
		int [] arr= {10,20,30};
		method3(arr);
		System.out.println(arr[0]);

	}
	
	public static void method1() {
		System.out.println("hello everyone good morning");
		
	}
	public static void method1(String a) {
		System.out.println(a);
		
	}
	
    public static void method1(int a,int b) {
    	System.out.println("addition of "+a+" and "+b+" is :"+(a+b));
		
	}
    public static int method2(int x) {
    	int a=x;
    	//System.out.println();
    	return x;
    }
    public static void method3(int [] arr) {
    	int z=arr[0]=98;                 
     // System.out.println(arr[0]=98);

}
}
