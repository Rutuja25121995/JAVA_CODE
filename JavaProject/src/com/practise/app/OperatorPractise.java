package com.practise.app;

public class OperatorPractise {

	public static void main(String[] args) {
		OperatorPractise obj=new OperatorPractise();
		boolean result=obj.numberCompare(20,40);
        System.out.println(result);
        System.out.println(marksCompare(50,60));
	}
	
	public boolean numberCompare(int firstNumber,int secondNumber) {
		boolean flag=(firstNumber < secondNumber) && (secondNumber> firstNumber);
		return flag;
	}
	
	public static  boolean marksCompare(int a,int b) {
		boolean marks=(a<b)||(b<a);
		float f=20.0f;
		System.out.println(f);
		return marks;
		
	}

}
