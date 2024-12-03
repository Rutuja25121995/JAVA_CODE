package com.infosys.app;

public class ControlStatements {

	public static void main(String[] args) {
		ControlStatements obj=new ControlStatements();
		String msg=obj.User(30);
		System.out.println(msg);
		ControlStatements.result(85);

	}
	
    public String User(int age) {
    	String msg;
    	if (age>18) {
    		msg="mature";
    	}
    	else {
    		msg="adult";
    	}
    	return msg;
    }
    
    
    
    public static void result(int marks) {
    	if (marks>=75) {
    		if(marks>=90) {
    			System.out.println("congrats..ur marks are above 90");
    		}
    		else
    		{
    			System.out.println("your marks are between 76 to 90");
    		}
    		System.out.println("Distinction");
    	}else if(marks>=60 && marks<75) 
    	{
    		System.out.println("First class");
    	}
    	else if (marks>35  && marks<60 )
    	{
    		System.out.println("Second class");	
    	}
    	else
    	{
    		System.out.println("Fail");
    	}
    	
    }

}
