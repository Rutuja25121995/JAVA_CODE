package com.vehicle.vehicle.evehicle.ebike;

public class ebike {
	  String name;
	  String colour;
	  int modalNo;
	  
	  ebike(String a,String b,int c){
		  this.name=a;
		  this.colour=b;
		  this.modalNo=c;
		  
	  }

	public static void main(String[] args) {
	 ebike ebikeobj=new ebike("SPLENDER","blue",23);
	System.out.println(ebikeobj.name);
	System.out.println(ebikeobj.colour);
	System.out.println(ebikeobj.modalNo);
	 
	
	}

}
