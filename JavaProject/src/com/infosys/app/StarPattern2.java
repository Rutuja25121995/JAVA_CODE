package com.infosys.app;

public class StarPattern2 {

	public static void main(String[] args) {
		pyramid();

	}
	public static void pyramid() {
		for(int i=1;i<=4;i++) 
		{
			for(int j=i;j<4;j++) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			
			System.out.println();
		}
	}

}
