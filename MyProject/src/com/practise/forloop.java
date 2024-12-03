package com.practise;

import java.util.Scanner;

public class forloop {
	
     public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int number=sc.nextInt();
	  table1(number);
     }
     public static void table1(int number) {
    	 for(int i=1;i<=10;i++) {
    		 int table=number*i;
    		 System.out.println(number +"*"+ i + "=" +table);
    	 }
     }
}
