package com.fusion;

public class Object {
	int age;
	String name;
	
	Object(int a,String b){
		int x=a;
		String y=b;
		System.out.println(x);
        System.out.println(y);
	}
	
	public void method1(String name,int age) {
		this.name=name;
		this.age=age;
	
	}

	public static void main(String[] args) {
		Object obj=new Object(20,"jfgi");
        obj.age=26;//initialize object through reference
        obj.name="rutuja";//initialize object through reference
        // System.out.println((obj.age=26 )+ " " +(obj.name="rutuja"));
        System.out.println(obj.age+ " " +obj.name);
     
        obj.method1("prerana", 27);
        System.out.println(obj.name);
        System.out.println(obj.age);
        Object obj1=new Object(10,"oioi");
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        
	}

}
