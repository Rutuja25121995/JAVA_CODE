package com.infosys.app;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		ForLoop obj=new ForLoop();
		obj.numberPrint();
		
	}
   public void numberPrint() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter a number");
	   int number=sc.nextInt();
	   for(int i=1;i<=number;i++) {
		   System.out.println(i);
	   }
	   
   }
}
