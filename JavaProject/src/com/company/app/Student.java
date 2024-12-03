package com.company.app;

public class Student
{
        int age;
        String name;
        int rollNo;
        Address myaddress;
        
     Student()
     {
	    age=20;
	    name="rutuja";
	 }
     
    Student(int a,int b)
     {
        this.age=a;
        this.rollNo=b;
     }
    
    Student (String str,int a,int b)
    {
    	this.name=str;
    	this.age=a;
    	this.rollNo=b;
    }
    
    Student (String name1,int age1,Address address123){
    	this.name=name1;
    	this.age=age1;
    	this.myaddress=address123;
    }
 
    public static void main(String[] args) 
     {
	    Student st=new Student();
	    System.out.println(st.age);
	    System.out.println(st.name);
	    System.out.println("=================");
	    
	    Student st1=new Student(27,2);
	    System.out.println(st1.age);
	    System.out.println(st1.rollNo);
	    System.out.println("=================");
	    
	    Student st2=new Student("fusion",24,3);
	    System.out.println(st2.name);
	    System.out.println(st2.age);
	    System.out.println(st2.rollNo);
	    System.out.println("=================");
	    
	    Address addressobj= new Address(41212, "Nanded");
	    Student st4 = new Student( "rutuja",26,addressobj);//address=object
	    
	    System.out.println(st4.name);
	    System.out.println(st4.age);
	    System.out.println(st4.myaddress.pincode);
     }
}
