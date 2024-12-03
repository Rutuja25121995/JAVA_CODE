package com.vehicle.vehicle.evehicle.ecar;

public class ecar {
	String carName;
	String colour;
	int price;
	
	ecar(int price1 ,String name,String colour1){
		price=price1;
		carName=name; 
		colour=colour1;
	
	}

	public static void main(String[] args) {
		ecar carobj=new ecar(500000,"HUNDAI","black");
		System.out.println(carobj.price);
		System.out.println(carobj.carName);
		System.out.println(carobj.colour);
	}

}
