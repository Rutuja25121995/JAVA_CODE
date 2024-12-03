package com.fusion1;

public class Test2 {

	public static void main(String[] args) {

		Car cc = new Car();
		cc.setColour("BLACK");
		//cc.name = "BMW";
		//cc.speed = 120;
		cc.setName("BMW");
		cc.setSpeed(120);
		cc.display();

		System.out.println("------------------------");
		Car cc1 = new Car();
		cc1.setColour("RED");
		cc1.setName("AUDI");
		cc1.setSpeed(-10);
		cc1.display();
		System.out.println("------------------------");

		Car cc2 = new Car();
		cc2.setColour("WHITE");
		cc2.setName("SWIFT");
		cc2.setSpeed(-30);
		cc2.display();

		System.out.println("------------------------");
		
		Car cc3 = new Car();
		cc3.setColour("GRAY");
		cc3.setName("SWIFT-DSIRE");
		cc3.setSpeed(-40);
		cc3.display();
		
		System.out.println("------------------------");
		Car cc4=new Car();
		cc4.setName("VOLVO");
		cc4.setColour("BLUE");
		cc4.setSpeed(150);
		System.out.println(cc4.getColour());
		System.out.println(cc4.getName());
		System.out.println(cc4.getSpeed());
	
		
		

		
		
	}

}
