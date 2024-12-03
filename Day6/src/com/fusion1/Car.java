package com.fusion1;

public class Car {
	
	private String name;
	private String colour;
	private int speed;
	
	
	public void setSpeed(int userspeed){
		
		if(userspeed<50)
		{
			this.speed=50;
		}else{
			this.speed=userspeed;
		}
		
	}
	
	
	public int getSpeed() {
		return speed;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	void display()
	{
		System.out.println(this.colour);
		System.out.println(this.name);
		System.out.println(this.speed);
	}


}
