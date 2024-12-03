package com.fusion.abstractclass;

public class Test {

	public static void main(String[] args) {
		bike b=new bike();
		b.vehicleType();
		b.avgweight();
		b.avglength();
		b.avgSpeed();
		System.out.println("---------------------------------------");
		car c=new car();
		c.vehicleType();
		c.avgweight();
		c.avglength();
		c.avgSpeed();
	}

}
