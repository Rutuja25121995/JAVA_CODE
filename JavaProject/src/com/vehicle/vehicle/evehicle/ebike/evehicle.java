package com.vehicle.vehicle.evehicle.ebike;

public class evehicle {
	ebike bikedetails;
	String str;
	String col;
	
	public evehicle(String str, String col,ebike bikedetails11) {
		
		this.str = str;
		this.col = col;
		this.bikedetails=bikedetails11;
	}

	public static void main(String[] args) {
		ebike obj=new ebike("honda","BLACK",24);
		evehicle obj2=new evehicle("honda1","BLACK1",obj);
		System.out.println(obj2.str);
		System.out.println(obj2.col);
		System.out.println(obj2.bikedetails.name);
        System.out.println(obj2.bikedetails.colour);
        System.out.println(obj2.bikedetails.modalNo);
	}
	

}
