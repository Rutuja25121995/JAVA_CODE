package com.practise.app;

public class array1 {

	public static void main(String[] args) {
		arr1();
		arr2();
		arr3();
	}
	public static void arr1() {
		int [] marks=new int[5];
        marks[0]=10;
        marks[1]=12;
        marks[2]=14;
        marks[3]=16;
        marks[4]=18;
        
        for(int i=0;i<=4;i++) {
       	 System.out.println(marks[i]);
        }
		
	}
	public static void arr2() {
		int [] number;
		number=new int[2];
		number[0]=55;
		number[1]=35;
		for(int element:number) {
			System.out.println(element);
		}
	}
    public static void arr3() {
    	String [] str= {"rutuja","madhav","khadkikar"};
    	
    	System.out.println("length = "+ str.length);
    	
    	for(int i=0;i<str.length;i++) {
    		System.out.println(str[i]);
    	}
    	
    	System.out.println("====== by using for each ======");
    	for(String element:str) {
    		System.out.println(element);
    	}
    }
}
