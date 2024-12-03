package com.fusion1;

public class Car2 {

	String name;
	String colour;
	int speed;
	// name, colour ,speed

	Car2(String name, String colour, int speed) {
		this.name = name;
		this.colour = colour;
		this.speed = speed;

	}

	public static void main(String[] args) {
		Car2 c = new Car2("BMW", "Black", 120);
		
		System.out.println(c.name);
		System.out.println(c.colour);
		System.out.println(c.speed);

	}

	// name --> BMW
	// colour --> black
	// speed --> 120

}
