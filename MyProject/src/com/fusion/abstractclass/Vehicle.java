package com.fusion.abstractclass;

public abstract class Vehicle {
	
	 Vehicle(){
		 System.out.println("constructor of vehicle classa");
	 }
	public void vehicleType(){
		System.out.println("vehicleType--twowheeler/fourwheeler");  //non-abstract method
	}
	public abstract void avgweight();     //abstract method
	public abstract void avglength();     //abstract method
	public abstract void avgSpeed();      //abstract method
}
