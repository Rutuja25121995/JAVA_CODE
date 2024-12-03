package com.practise;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter direction");
		String direction=sc.next();
          direction1(direction);
	}
	
	public static String direction1(String direction) {
		switch(direction)
		{
		case "east":
		{
			System.out.println("east");
			break;
		}
		
		case "west":
		{
			System.out.println("west");
			break;
		}
		
		case "south":
		{
			System.out.println("south");
			break;
		}
		
		case "north":
		{
			System.out.println("north");
			break;
		}
		default:
		{
			System.out.println("invalid input");
			break;
		}
		}
		return direction;
	}

}
