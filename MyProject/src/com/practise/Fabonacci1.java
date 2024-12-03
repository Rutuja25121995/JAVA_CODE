package com.practise;

public class Fabonacci1 {

	public static void main(String[] args) {
     int num1=0;
     int num2=1;int num3;
     System.out.print(num1+" ");
     System.out.print(num2+" ");
     for(int i=1;i<=10;i++) {
    	 num3=num1+num2;//0+1=1,1+1=2,1+2=3,2+3=5
    	 System.out.print(num3+" ");//1,2,3,5
    	 num1=num2;//1,1,2
    	 num2=num3;//1,2,3
     }
     
	}

}
