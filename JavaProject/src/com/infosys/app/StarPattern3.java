package com.infosys.app;

public class StarPattern3 {

	public static void main(String[] args) {
		pattern1();
		pattern2();
		pattern3();
		pattern4();
		}
     // hollow rectangle
	public static void pattern1()
	{
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=4;j++)
			{
				if(i==1 || j==1 || i==4 || j==4)
				{
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		System.out.println("======================= ");
	}
	
	public static void pattern2() {
		
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}  
			System.out.println();
	     }
		System.out.println("=================");
	}
	
	
	public static void pattern3() {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j<4;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=================");
		
	}
	
	public static void pattern4() {
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
              for(int k=i;k<=4;k++) {
            	  System.out.print("*");
              }
              System.out.println();
			}
		}
	
	
	
}
