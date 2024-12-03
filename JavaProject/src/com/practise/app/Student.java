package com.practise.app;

public class Student{
	int age=28;
	String name="rutuja";
	int roll_no=23;
	Address address;
	public static void main(String []args) {
		
		Student st=new Student();
		Address add=new Address();
		System.out.println(add.pincode);
		//System.out.println();
		System.out.println(st.name);
		System.out.println(st.age);
		System.out.println(st.roll_no);
	}
}