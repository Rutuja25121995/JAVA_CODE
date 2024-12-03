package com.practise;

 public class class1 {
	 int id;
	 String name;
	 
	 public void method1(int id1,String name1) {
		 id=id1;
		 name=name1;
	 }
	 
	 class1(int id11,String name11){
		 int id=id11;
		 String name=name11;
	 }
	 public class1() {
		
	}

	public static void main(String[] args) {
	 class1 cs=new class1();
	 cs.id=90;
	 cs.name="rutuja";
	 System.out.println(cs.id);
	 System.out.println(cs.name);
	 cs.method1(12, "PRERANA");
	 System.out.println(cs.id);
	 System.out.println(cs.name);
	 
	 class1 cs1=new class1(22,"rakhi");
	 System.out.println(cs1.id);
	 System.out.println(cs1.name);
	 
	}

}
