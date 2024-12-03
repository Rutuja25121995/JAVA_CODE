package com.practise1.constructor;

public class extrainfo {
	private String lastName;
	int pincode;
	
	extrainfo(String lastname1,int pincode1){
		lastName=lastname1;
		pincode=pincode1;
	}
	
	void show() {
		System.out.println(lastName);
		System.out.println(pincode);
	}

}
