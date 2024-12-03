package com.collection;

public class car {
	String carName;
	int price;
	
	public car(String carName,int price) {
		this.carName=carName;
		this.price=price;
	}

	@Override
	public String toString() {
		return "car [carName=" + carName + ", price=" + price + "]";
	}
	

}
