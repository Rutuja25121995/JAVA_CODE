package com.practise;

public class Constructor {
	String name;
	int age;
	Constructor()
	{
		 name="rutuja";
		 age=26;
	}
	Constructor(String name1,int age1){
		name=name1;
		age=age1;
	}
	
	
	public static void main(String[] args) {
		Constructor cc=new Constructor();
        System.out.println(cc.name);
        System.out.println(cc.age);
        System.out.println("===============");
        
        Constructor cc1=new Constructor("Prerana",27);
        System.out.println(cc1.name);
        System.out.println(cc1.age);
        System.out.println("===============");
	}

}
