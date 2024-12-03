package com.practise1.constructor;

public class student {
	
	String name;
	int id;
	
	
	    student(int id1,String name1){
	        id=id1;
		    name=name1;
		    System.out.println("hello java");
	    }
	    
	    void display() {
	    	System.out.println(id);
			System.out.println(name);
			
	    }
	
	public static void main(String []args) {
		student stud=new student(10,"rutuja");
		extrainfo ee=new extrainfo("KHADKIKAR",431603);
		//stud.id=22;
		//stud.name="rk";
		//System.out.println(ee.lastName);it is private so cannot call directly
		stud.display();
		ee.show();
		
	}

}
